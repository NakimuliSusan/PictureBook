package dev.pinky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FoodActivity : AppCompatActivity() {
    lateinit var btnNext : Button
    lateinit var btnPrev : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        btnNext = findViewById(R.id.btnNext)
        btnPrev = findViewById(R.id.btnPrev)

        btnNext . setOnClickListener {
            val intent = Intent(this,AfricanFoodActivity::class.java)
            startActivity(intent)
        }
        btnPrev .setOnClickListener {
            val  intent = Intent(this,SleepActivity::class.java)
            startActivity(intent)
        }
    }
}