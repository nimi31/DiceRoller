package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView //here lateinit specifies that null value is not given to
    // the variable and it will get initialise later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button=  findViewById(R.id.rollButton)
//        rollButton.text="Lets Roll"
        rollButton.setOnClickListener {
            Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT).show()
            diceRoll()

        }
    diceImage=findViewById(R.id.diceImage)

    }

    private fun diceRoll() {
//        val resultText : TextView = findViewById(R.id.resultText)
        //        resultText.text=random.toString()
//        Random().nextInt(6)+1 we can give it inline
       val drawableImage= when(Random().nextInt(6)+1){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }
//        val diceImage:ImageView=findViewById(R.id.diceImage)
//        above statement will load again and again
//        that is after every roll it will search for the id so we will initialise it globally
        diceImage.setImageResource(drawableImage)


    }
}