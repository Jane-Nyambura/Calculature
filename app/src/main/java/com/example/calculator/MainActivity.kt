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


        val num1=findViewById<EditText>(R.id.etNum1)
        val num2=findViewById<EditText>(R.id.etNum2)

        val btn1=findViewById<Button>(R.id.btnAdd)
        val btn2=findViewById<Button>(R.id.btnMinus)
        val btn3=findViewById<Button>(R.id.btnModulus)
        val btn4=findViewById<Button>(R.id.btnMultiply)
        val answer=findViewById<TextView>(R.id.tvAnswer)


        btn1.setOnClickListener {
            if (num1.text.toString()==""){
            Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
            }else if (num2.text.toString()==""){
                Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
            }
            else {
                val number1 = num1.toString().toInt()
                var number2 = num2.toString().toInt()
                var result = number1 + number2
                answer.text = ("$result")
            }

            }
            btn2.setOnClickListener {
                if (num1.text.toString()==""){
                    Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
                }else if (num2.text.toString()==""){
                    Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
                }
                else {
                    val number1 = num1.toString().toInt()
                    var number2 = num2.toString().toInt()
                    var result = number1 - number2
                    answer.text = ("$result")
                }

            }

        btn3.setOnClickListener {
            if (num1.text.toString()==""){
                Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
            }else if (num2.text.toString()==""){
                Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
            }
            else {
                val number1 = num1.toString().toInt()
                var number2 = num2.toString().toInt()
                var result = number1 % number2
                answer.text = ("$result")
            }

        }
        btn4.setOnClickListener {
            if (num1.text.toString()==""){
                Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
            }else if (num2.text.toString()==""){
                Toast.makeText(baseContext,"enter a number", Toast.LENGTH_LONG).show()
            }
            else {
                val number1 = num1.toString().toInt()
                var number2 = num2.toString().toInt()
                var result = number1 * number2
                answer.text = ("$result")
            }

        }
        }


    }
