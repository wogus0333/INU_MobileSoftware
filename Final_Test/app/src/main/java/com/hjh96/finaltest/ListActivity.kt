package com.hjh96.finaltest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var position_ : Int = -1

        var btn_list = findViewById<Button>(R.id.btn_list)

        var list = findViewById<View>(R.id.lv_list) as ListView
        var mid = arrayOf("레옹", "바람과 함께 사라지다", "AMADEUS","라스트 모히칸",
                "센과 치히로의 행방불명", "ALIEN", "터미네이터2" , "테이큰",
                "브레이브 하트", "CINEMA PARADISO" )

        var adapter : ArrayAdapter<String> = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,mid)
        list.adapter =  adapter
        list.setOnItemClickListener { parent, view, position, id ->
            position_ = position
        }
        btn_list.setOnClickListener {
            var intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Position", position_)
            startActivity(intent)
        }



    }
}