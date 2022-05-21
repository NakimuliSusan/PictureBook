package dev.pinky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MeditateActivity : AppCompatActivity() {
    lateinit var btnNext4 : Button
    lateinit var btnPrev4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditate)
        btnNext4 = findViewById(R.id.btnNext4)
        btnPrev4 = findViewById(R.id.btnPrev4)

        btnPrev4 .setOnClickListener {
            val intent = Intent(this,ExercisesActivity::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener {
            val intent = Intent(this,SleepActivity::class.java)
            startActivity(intent)
        }
    }
}