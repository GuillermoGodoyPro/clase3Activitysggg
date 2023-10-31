package com.matesdev.clase3activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var btiramain: Button
    private lateinit var setNombre: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras


        btiramain = findViewById(R.id.btgotomain)

        val nombre = bundle?.getString("name", "")
        val edad = bundle?.getString("age", "")

        setNombre = findViewById(R.id.tvNombre)

        Toast.makeText(this, "$nombre $edad", Toast.LENGTH_SHORT).show()
        setNombre.text = nombre

        btiramain.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java  )


            startActivity(intent)
        }

    }
}