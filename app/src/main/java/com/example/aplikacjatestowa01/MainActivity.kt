package com.example.aplikacjatestowa01

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mojPrzycisk = findViewById<ImageButton>(R.id.imageButton)
        var kolorBlue = findViewById<Button>(R.id.blue)
        var kolorGreen = findViewById<Button>(R.id.green)
        mojPrzycisk.setOnClickListener {
            mojPrzycisk.setImageResource(R.drawable.szwagier)
        }

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable._437570871_c8dwwh_fb_plus)
        val bitmapBlue = BitmapFactory.decodeResource(resources, R.drawable.blue)
        val filterBitmap = Bitmap.createBitmap(bitmap.width, bitmap.height, Bitmap.Config.ARGB_8888)
    }
}