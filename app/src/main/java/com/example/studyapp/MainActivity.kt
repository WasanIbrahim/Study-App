package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var AndroidButton = findViewById<Button>(R.id.javaButton)
        var kotlinButton = findViewById<Button>(R.id.kotlenButton)



        AndroidButton.setOnClickListener {
            startActivity(Intent(this, AndroidActivity::class.java))

        }

        kotlinButton.setOnClickListener {
            startActivity(Intent(this, kotlinActivity::class.java))


        }

    }
}