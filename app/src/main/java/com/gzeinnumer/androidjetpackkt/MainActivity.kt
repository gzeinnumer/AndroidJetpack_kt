package com.gzeinnumer.androidjetpackkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posts = mutableListOf<PostItem>()

        for (i in 1..24){
            posts.add(PostItem("Zein Learn Jetpack "+i, " hari ini"))
        }

        rv.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = MyAdapter(posts)
        }
    }
}
