package com.matesdev.clase3activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btContinuar: Button
    private lateinit var nombre: String
    private lateinit var edad: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btContinuar = findViewById(R.id.btirasecond)
        nombre = "Aspros"
        edad = "55"

        btContinuar.setOnClickListener {
            val intent = Intent(  this, MainActivity2::class.java )
            intent.putExtra("name", nombre)
            intent.putExtra("age", edad)

            startActivity(intent)
        }
    }

    



}