
package com.example.money

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum.setOnClickListener {


            var year = 10
            var interest = DoubleArray(4)
            var year2 = arrayListOf<String>("1-3 ปี","4-7 ปี","8-10 ปี")
            var sum:Double = 0.00

            print("Input Money : ")

            if(year in 1..10){
                year -= 7
                if(year in 1..3){
                    interest[0] = money.text.toString().toDouble()*3/100
                    sum = money.text.toString().toDouble()+interest[0]
                    year = 10
                }
                year -= 3
                if(year in 4..7){
                    interest[1] = money.text.toString().toDouble()*5/100
                    sum += interest[1]
                    year = 10
                }
                if(year in 7..10){
                    interest[2] =money.text.toString().toDouble()*7/100
                    sum += interest[2]
                }

            }else{
                print("Error")
            }

           total.text = sum.toString()

        }
    }
}