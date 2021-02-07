package com.example.gpa

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ok.setOnClickListener {
            if(sub1.text.toString() == "" || sub2.text.toString() == "" || sub3.text.toString() == "" || sub4.text.toString() == "" || sub5.text.toString() == ""
                || credit1.text.toString() == "" || credit2.text.toString() == "" || credit3.text.toString() == "" || credit4.text.toString() == "" || credit5.text.toString() == ""
                || point1.text.toString() == "" || point2.text.toString() == "" || point3.text.toString() == "" || point4.text.toString() == "" || point5.text.toString() == ""
            ){
                Toast.makeText(applicationContext,"Please Input All Text Box Before Press OK!!!", Toast.LENGTH_SHORT).show()
            }else{
                var sumcredit = 0
                var total = 0.0
                var sum1:Double = 0.0
                var sum2 = 0.0
                var sum3 = 0.0
                var sum4 = 0.0
                var sum5 = 0.0

                sum1 = credit1.text.toString().toInt().toDouble()*point1.text.toString().toDouble()
                sum2 = credit2.text.toString().toInt().toDouble()*point2.text.toString().toDouble()
                sum3 = credit3.text.toString().toInt().toDouble()*point3.text.toString().toDouble()
                sum4 = credit4.text.toString().toInt().toDouble()*point4.text.toString().toDouble()
                sum5 = credit5.text.toString().toInt().toDouble()*point5.text.toString().toDouble()

               sumcredit = credit1.text.toString().toInt()+credit2.text.toString().toInt()+credit3.text.toString().toInt()+credit4.text.toString().toInt()+credit5.text.toString().toInt()
                total = (sum1+sum2+sum3+sum4+sum5)/sumcredit
                totalcre.text = sumcredit.toString()
               val decimal = BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN)
                gpa.text = decimal.toString()
            }

        }

        clear.setOnClickListener {
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")
            credit1.setText("")
            credit2.setText("")
            credit3.setText("")
            credit4.setText("")
            credit5.setText("")
            point1.setText("")
            point2.setText("")
            point3.setText("")
            point4.setText("")
            point5.setText("")
//
        }

    }
}