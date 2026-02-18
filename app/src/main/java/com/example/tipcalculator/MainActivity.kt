package com.example.tipcalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val billInput = findViewById<EditText>(R.id.edittextamount)
        val tipInput = findViewById<EditText>(R.id.edittexttip)
        val tipButton = findViewById<Button>(R.id.myButton)
        val resultText = findViewById<TextView>(R.id.textanswer)

        tipButton.setOnClickListener{
            val billText = billInput.text.toString()
            val tipText = tipInput.text.toString()

            if (billText.isNotEmpty()&&tipText.isNotEmpty()){
                val billAmt = billText.toDouble()
                val tipPercent = tipText.toDouble()

                val tipAmt = billAmt*(tipPercent/100)

                resultText.text="Tip Amount: R%.2f".format(tipAmt)
            }else
            {
                resultText.text="Amount or tip percent aren't filled"
            }
        }
    }
}