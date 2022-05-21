package dev.pinky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AfricanFoodActivity : AppCompatActivity() {
    lateinit var btnNext2 : Button
    lateinit var btnPrev2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_african_food)
        btnPrev2 = findViewById(R.id.btnPrev2)
        btnNext2 = findViewById(R.id.btnNext2)

        btnPrev2.setOnClickListener {
            val intent = Intent(this,FoodActivity::class.java)
            startActivity(intent)
        }
        btnNext2. setOnClickListener {
            val intent = Intent(this,ExercisesActivity::class.java)
            startActivity(intent)
        }
    }
}