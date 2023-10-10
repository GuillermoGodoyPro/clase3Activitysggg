package com.matesdev.clase3activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var btiramain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btiramain = findViewById(R.id.btgotomain)

        btiramain.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java  )

            startActivity(intent)
        }

    }
}