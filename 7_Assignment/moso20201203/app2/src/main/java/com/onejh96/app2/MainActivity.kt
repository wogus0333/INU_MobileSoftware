package com.onejh96.app2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var toastText : TextView
    lateinit var toastView : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "갤러리 영화 포스터"

        val gallery = findViewById<Gallery>(R.id.gallery1)
        val galAdapter = MyGalleryAdapter(this)
        gallery.adapter = galAdapter
    }

    inner class MyGalleryAdapter(var context: Context) : BaseAdapter(){
        var posterID = arrayOf(
            R.drawable.mov11, R.drawable.mov12, R.drawable.mov13, R.drawable.mov14,
            R.drawable.mov15, R.drawable.mov16, R.drawable.mov17, R.drawable.mov18,
            R.drawable.mov19, R.drawable.mov20
        )
        var posterName = arrayOf(
            "여인의 향기", "쥬라기 공원", "포레스트 검프", "Groundhog Day", "혹성탈출",
            "아름다운 비행", "내 이름은 칸", "해리포터", "마더", "킹콩을 들다"
        )
        override fun getCount(): Int {
            return posterID.size
        }
        override fun getItem(position: Int): Any {
            return 0
        }
        override fun getItemId(position: Int): Long {
            return 0
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val imageview = ImageView(context)
            imageview.layoutParams = Gallery.LayoutParams(200,300)
            imageview.scaleType = ImageView.ScaleType.FIT_CENTER
            imageview.setPadding(5,5,5,5)

            imageview.setImageResource(posterID[position])

            imageview.setOnClickListener{
                var ivPoster = findViewById<ImageView>(R.id.ivPoster)
                ivPoster.scaleType = ImageView.ScaleType.FIT_CENTER
                ivPoster.setImageResource(posterID[position])
                false
                var toast = Toast(this@MainActivity)
                toastView = View.inflate(this@MainActivity, R.layout.movie_toast, null)
                toastText = toastView.findViewById<TextView>(R.id.tv_movie_title)
                toastText.text = posterName[position]
                toast.view = toastView
                toast.show()
            }
            return imageview
        }
    }
}