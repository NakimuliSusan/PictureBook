package dev.pinky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SleepActivity : AppCompatActivity() {
    lateinit var btnPrev5 : Button
    lateinit var btnNext5 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep)
        btnNext5 = findViewById(R.id.btnNext5)
        btnPrev5 = findViewById(R.id.btnPrev5)

        btnPrev5 . setOnClickListener {
            val intent = Intent(this,MeditateActivity::class.java)
            startActivity(intent)
        }
        btnNext5 . setOnClickListener {
            val intent = Intent(this,FoodActivity::class.java)
            startActivity(intent)
        }
    }
}