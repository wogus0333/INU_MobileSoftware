package com.hjh96.finaltest

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var image = findViewById<ImageView>(R.id.iv_result)
        var text = findViewById<TextView>(R.id.tv_result_title)

        var position  = intent.getIntExtra("Position",0)

        var title = arrayOf("레옹", "바람과 함께 사라지다", "AMADEUS","라스트 모히칸",
                "센과 치히로의 행방불명", "ALIEN", "터미네이터2" , "테이큰",
                "브레이브 하트", "CINEMA PARADISO" )
        var poster = arrayOf(R.drawable.mov51,
                R.drawable.mov52,
                R.drawable.mov53,
                R.drawable.mov54,
                R.drawable.mov55,
                R.drawable.mov56,
                R.drawable.mov57,
                R.drawable.mov58,
                R.drawable.mov59,
                R.drawable.mov60)

        for(i in 0..9) {
            if (position == i)
                image.setImageResource(poster[i])
                text.text = title[i]
        }
    }
}