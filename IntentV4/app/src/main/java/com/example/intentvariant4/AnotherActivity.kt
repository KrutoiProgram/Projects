package com.example.intentvariant4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat

public lateinit var pg: ImageView

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        val data = intent.getStringExtra("data")
        pg = findViewById(R.id.imageView)

        if(data=="М")
        {
            pg.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.man))
        }
        else if(data=="Ж")
        {
            pg.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.woman))
        }
    }
}