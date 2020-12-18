package com.hjh96.finaltest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rg_main = findViewById<RadioGroup>(R.id.rg_main)
        var rb_main_calc = findViewById<RadioButton>(R.id.rb_main_calc)
        var rb_main_list = findViewById<RadioButton>(R.id.rb_main_list)
        var btn_main = findViewById<Button>(R.id.btn_main)

        rg_main.setOnCheckedChangeListener { group, checkedId ->
            if (group.id == R.id.rb_main_calc) {
                rb_main_calc.isChecked = true
                rb_main_list.isChecked = false
            } else if (group.id == R.id.rb_main_list) {
                rb_main_calc.isChecked = false
                rb_main_list.isChecked = true
            }
        }

        btn_main.setOnClickListener {
            if (rb_main_calc.isChecked == true) {
                var intent = Intent(this, CalcActivity::class.java)
                startActivityForResult(intent, 0)
            } else if (rb_main_list.isChecked == true) {
                var intent = Intent(this, ListActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            var result = data!!.getDoubleExtra("Result", 0.0)
            var tv_main_result = findViewById<TextView>(R.id.tv_main_result)
            tv_main_result.text = "연산결과 : " + result.toString()
        }
        if(resultCode == Activity.RESULT_CANCELED){
            var result = data!!.getStringExtra("Result")
            var tv_main_result = findViewById<TextView>(R.id.tv_main_result)
            tv_main_result.text = "연산결과 : " + result.toString()
        }
    }
}