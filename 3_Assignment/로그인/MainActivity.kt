package com.example.practice20201016_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input_id = findViewById<EditText>(R.id.editText2) // 입력된 id
        var id = 201501494
        var input_passwd = findViewById<EditText>(R.id.editText3) // 입력된 비번
        var passwd = "한재현"
        var result = findViewById<TextView>(R.id.textView3)

        button.setOnTouchListener { v, event ->
            var id_num = input_id.text.toString()
            var passwd_str = input_passwd.text.toString()
            if (passwd_str.equals("") || passwd_str == null || id_num == null || id_num.equals(""))
                result.text = "결과 :"
            else {
                if (id == Integer.parseInt(id_num) && passwd == passwd_str)
                    result.text = "결과 : 로그인 성공"
                else if (id == Integer.parseInt(id_num) || passwd == passwd_str)
                    result.text = "결과 : 로그인 실패"
            }

            false
        }

    }
}