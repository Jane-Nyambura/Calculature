package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var answer=findViewById<TextView>(R.id.tvAnswer)
        var num1=findViewById<EditText>(R.id.etNum1)
        var num2=findViewById<EditText>(R.id.etNum2)

        var btn1=findViewById<Button>(R.id.btnAdd)
        var btn2=findViewById<Button>(R.id.btnMinus)
        var btn3=findViewById<Button>(R.id.btnModulus)
        var btn4=findViewById<Button>(R.id.btnMultiply)



        btn1.setOnClickListener {
            Toast.makeText(baseContext,"num", Toast.LENGTH_LONG).show()

            var number1=num1.toString().toInt()
            var number2=num2.toString().toInt()
            var result=number1+number2
            answer.text=("$result")


        }
        btn2.setOnClickListener {
            Toast.makeText(baseContext,"num", Toast.LENGTH_LONG).show()

            var number1=num1.toString().toInt()
            var number2=num2.toString().toInt()
            var result=number1-number2
            answer.text=("$result")


        }
        btn3.setOnClickListener {
            Toast.makeText(baseContext,"num", Toast.LENGTH_LONG).show()

            var number1=num1.toString().toInt()
            var number2=num2.toString().toInt()
            var result=number1%number2
            answer.text=("$result")

        }
        btn4.setOnClickListener {
            Toast.makeText(baseContext,"num", Toast.LENGTH_LONG).show()

            var number1=num1.toString().toInt()
            var number2=num2.toString().toInt()
            var result=number1/number2
            answer.text=("$result")


        }
    }
}