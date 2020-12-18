package com.hjh96.finaltest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class CalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        var rg_calc = findViewById<RadioGroup>(R.id.rg_calc)
        var rb_calc_plus = findViewById<RadioButton>(R.id.rb_calc_plus)
        var rb_calc_minus = findViewById<RadioButton>(R.id.rb_calc_minus)
        var edt_calc_1 = findViewById<EditText>(R.id.edt_calc_number1)
        var edt_calc_2 = findViewById<EditText>(R.id.edt_calc_number2)
        var btn_calc_calc = findViewById<Button>(R.id.btn_calc_calc)
        var btn_calc_exit = findViewById<Button>(R.id.btn_calc_exit)

        var inIntent = intent


        rg_calc.setOnCheckedChangeListener { group, checkedId ->
            if (group.id == R.id.rb_calc_plus) {
                rb_calc_plus.isChecked = true
                rb_calc_minus.isChecked = false
            } else if (group.id == R.id.rb_calc_minus) {
                rb_calc_plus.isChecked = false
                rb_calc_minus.isChecked = true
            }
        }

        btn_calc_calc.setOnClickListener {
            if(!(edt_calc_1.text.toString().isEmpty() || edt_calc_2.text.toString().isEmpty())) {
                if (rb_calc_plus.isChecked == true) {
                    var hap = (edt_calc_1.text.toString()).toDouble() +
                            (edt_calc_2.text.toString()).toDouble()
                    var outIntent = Intent(this, MainActivity::class.java)
                    outIntent.putExtra("Result", hap)
                    setResult(Activity.RESULT_OK, outIntent)
                    finish()
                } else if (rb_calc_minus.isChecked == true) {
                    var sub = (edt_calc_1.text.toString()).toDouble() -
                            (edt_calc_2.text.toString()).toDouble()
                    var outIntent = Intent(this, MainActivity::class.java)
                    outIntent.putExtra("Result", sub)
                    setResult(Activity.RESULT_OK, outIntent)
                    finish()
                }
            }
        }

        btn_calc_exit.setOnClickListener{
            var outIntent = Intent(this, MainActivity::class.java)
            outIntent.putExtra("Result", "계산기 종료")
            setResult(Activity.RESULT_CANCELED, outIntent)
            finish()
        }
    }
}