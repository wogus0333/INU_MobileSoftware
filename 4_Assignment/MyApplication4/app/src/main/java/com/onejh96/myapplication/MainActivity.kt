package com.onejh96.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var selectYear = 0
    var selectMonth = 0
    var selectDay = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        title = "시간 예약"

        rdoCal.setOnClickListener{
            timePicker1.visibility = View.INVISIBLE
            calendarView1.visibility = View.VISIBLE
        }
        rdoTime.setOnClickListener {
            timePicker1.visibility = View.VISIBLE
            calendarView1.visibility = View.INVISIBLE
        }
        btnStart.setOnClickListener {
            chronometer1.base = SystemClock.elapsedRealtime()
            chronometer1.start()
            chronometer1.setTextColor(Color.RED)
        }
        btnEnd.setOnClickListener {
            chronometer1.stop()
            chronometer1.setTextColor(Color.BLUE)
            tvYear.text = selectYear.toString()
            tvMonth.text = selectMonth.toString()
            tvDay.text = selectDay.toString()
            tvHour.text = (timePicker1.currentHour).toString()
            tvMinute.text = (timePicker1.currentMinute).toString()
        }
        calendarView1.setOnDateChangeListener { view, year, month, dayOfMonth ->
            selectYear = year
            selectMonth = month + 1
            selectDay = dayOfMonth
        }
    }
}