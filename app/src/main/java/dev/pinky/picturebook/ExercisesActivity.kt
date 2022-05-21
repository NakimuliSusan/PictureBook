package dev.pinky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExercisesActivity : AppCompatActivity() {
    lateinit var btnNext3 : Button
    lateinit var btnPrev3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises)
        btnNext3 = findViewById(R.id.btnNext3)
        btnPrev3 = findViewById(R.id.btnPrev3)

        btnPrev3 . setOnClickListener {
            val intent = Intent(this,AfricanFoodActivity::class.java)
            startActivity(intent)
        }
        btnNext3 .setOnClickListener {
            val intent = Intent(this,MeditateActivity::class.java)
            startActivity(intent)
        }
    }
}