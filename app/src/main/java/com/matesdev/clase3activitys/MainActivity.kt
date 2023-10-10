package com.matesdev.clase3activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btContinuar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btContinuar = findViewById(R.id.btirasecond)

        btContinuar.setOnClickListener {
            val intent = Intent(  this, MainActivity2::class.java )
            startActivity(intent)
        }
    }

    



}