package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.math.BigDecimal
import java.math.RoundingMode
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum:Double = 0.0

        plus.setOnClickListener {
            if(num1.text.toString() == "" && num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            }else if(num1.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1", Toast.LENGTH_SHORT).show()
            }else if(num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num2", Toast.LENGTH_SHORT).show()
            }else{
                mark.text = "+"
                sum = num1.text.toString().toDouble()+num2.text.toString().toDouble()
                val decimal = BigDecimal(sum).setScale(1, RoundingMode.HALF_EVEN)
                dissum.text = decimal.toString()
            }

        }

        minus.setOnClickListener {
            if(num1.text.toString() == "" && num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            }else if(num1.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1", Toast.LENGTH_SHORT).show()
            }else if(num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num2", Toast.LENGTH_SHORT).show()
            }else {
                mark.text = "-"
                sum = num1.text.toString().toDouble() - num2.text.toString().toDouble()
                val decimal = BigDecimal(sum).setScale(1, RoundingMode.HALF_EVEN)
                dissum.text = decimal.toString()
            }
        }

        multiply.setOnClickListener {
            if(num1.text.toString() == "" && num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            }else if(num1.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1", Toast.LENGTH_SHORT).show()
            }else if(num2.text.toString() == "" || num2.text.toString() == "0"){
                Toast.makeText(applicationContext,"Please Input Num2", Toast.LENGTH_SHORT).show()
            }else {
                mark.text = "*"
                sum = num1.text.toString().toDouble() * num2.text.toString().toDouble()
                val decimal = BigDecimal(sum).setScale(1, RoundingMode.HALF_EVEN)
                dissum.text = decimal.toString()
            }
        }

        divider.setOnClickListener {
            if(num1.text.toString() == "" && num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            }else if(num1.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1", Toast.LENGTH_SHORT).show()
            }else if(num2.text.toString() == "" || num2.text.toString() == "0"){
                Toast.makeText(applicationContext,"Do not Num2 Zero or Null!!", Toast.LENGTH_SHORT).show()
            }else {
                mark.text = "/"
                sum = num1.text.toString().toDouble() / num2.text.toString().toDouble()
                val decimal = BigDecimal(sum).setScale(1, RoundingMode.HALF_EVEN)
                dissum.text = decimal.toString()
            }
        }

        modulo.setOnClickListener {
            if(num1.text.toString() == "" && num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            }else if(num1.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num1", Toast.LENGTH_SHORT).show()
            }else if(num2.text.toString() == ""){
                Toast.makeText(applicationContext,"Please Input Num2", Toast.LENGTH_SHORT).show()
            }else {
                mark.text = "%"
                sum = num1.text.toString().toDouble() % num2.text.toString().toDouble()
                val decimal = BigDecimal(sum).setScale(1, RoundingMode.HALF_EVEN)
                dissum.text = decimal.toString()
            }
        }

        clear.setOnClickListener {
            num1.setText("")
            num2.setText("")
            dissum.text = ""
        }

        
        
    }
}

