
package com.example.money

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var year = 10
        var interest = DoubleArray(11)
        var sum:Double = 0.00
        var vat = 0.0


        sumcal.setOnClickListener {

            if(year in 1..10){
                year -= 7
                if(year in 1..3){
                    for(i in 1..3){
                            interest[i] = (money.text.toString().toDouble()+vat)*3/100
                            vat += interest[i]
                            year = 10
                    }
                }

                year -= 3
                if(year in 4..7) {
                    for (i in 4..7) {
                            interest[i] = (money.text.toString().toDouble() + vat) * 5 / 100
                            vat += interest[i]
                        year = 10
                    }
                }

                if(year in 8..10){
                    for (i in 8..10) {
                        interest[i] = (money.text.toString().toDouble() + vat) * 7 / 100
                        vat += interest[i]

                    }
                }
            }

            sum = money.text.toString().toDouble()+vat
            val decimal = BigDecimal(sum).setScale(2, RoundingMode.HALF_EVEN)
            val decimalvat = BigDecimal(vat).setScale(2, RoundingMode.HALF_EVEN)
           total.text = decimal.toString()
            textView5.text = decimalvat.toString()

        }
        clear.setOnClickListener {
            money.setText("")
            textView5.text = ""
            total.text = ""
            vat = 0.0
            sum = 0.0
          
        }
    }
}