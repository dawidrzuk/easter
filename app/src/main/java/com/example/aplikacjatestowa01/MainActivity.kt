package com.example.aplikacjatestowa01

import android.graphics.*
import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ToggleButton
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mojPrzycisk = findViewById<ImageButton>(R.id.imageButton)
        var kolorBlue = findViewById<Button>(R.id.blue)
        var kolorGreen = findViewById<ToggleButton>(R.id.green)
        mojPrzycisk.setOnClickListener {
            mojPrzycisk.setImageResource(R.drawable.szwagier)
        }

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable._437570871_c8dwwh_fb_plus)
        val bitmapBlue = BitmapFactory.decodeResource(resources, R.drawable.blue)
        val filterBitmap = Bitmap.createBitmap(bitmap.width, bitmap.height, Bitmap.Config.ARGB_8888)

        kolorBlue.setOnClickListener {
            val paint = Paint()
            paint.alpha = 100
            val canvas = Canvas(filterBitmap)
            canvas.drawARGB(0, 0, 0, 0)
            canvas.drawBitmap(bitmapBlue, null, RectF(0f,0f,bitmap.width.toFloat(),bitmap.height.toFloat()),paint)
            canvas.drawBitmap(bitmap,0f,0f,paint)
            mojPrzycisk.setImageBitmap(filterBitmap)
        }
        kolorGreen.setOnClickListener {
            if (kolorGreen.isChecked ) {
                mojPrzycisk.setColorFilter(R.color.green)
                kolorGreen.background = (ContextCompat.getDrawable(kolorGreen.context, R.color.green))
            }
            else
            {
                mojPrzycisk.setColorFilter(null)
                kolorGreen.background = (ContextCompat.getDrawable(kolorGreen.context, R.color.green))
            }
        }
    }
}