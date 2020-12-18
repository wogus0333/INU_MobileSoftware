package com.hjh96.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        title = "투표 결과"

        val intent = intent
        val voteResult = intent.getIntArrayExtra("VoteCount")
        val imageName = intent.getStringArrayExtra("ImageName")

        var a = imageName?.size

        val tv = arrayOfNulls<TextView>(imageName!!.size)
        val rbar = arrayOfNulls<RatingBar>(imageName!!.size)

        val tvID = arrayOf(R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4,
            R.id.tv5, R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9)

        val rbarID = arrayOf(R.id.rBar1, R.id.rBar2, R.id.rBar3, R.id.rBar4,
            R.id.rBar5, R.id.rBar6, R.id.rBar7, R.id.rBar8, R.id.rBar9)

        for(i in voteResult!!.indices){
            tv[i] = findViewById<TextView>(tvID[i])
            rbar[i] = findViewById<RatingBar>(rbarID[i])
        }

        for(i in voteResult.indices){
            tv[i]!!.setText(imageName!![i])
            rbar[i]!!.setRating(voteResult[i].toFloat())
        }

        val btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            finish()
        }
    }
}