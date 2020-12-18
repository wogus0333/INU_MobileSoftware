package com.hjh96.app3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        title="Second 액티비티"

        var inIntent = intent
        var hapValue = inIntent.getIntExtra("Num1",0)+ inIntent.getIntExtra("Num2",0)

        btnReturn.setOnClickListener {
            var outIntent = Intent(this,MainActivity::class.java)
            outIntent.putExtra("Hap", hapValue)
            setResult(Activity.RESULT_OK,outIntent)
            finish()
        }
    }
}