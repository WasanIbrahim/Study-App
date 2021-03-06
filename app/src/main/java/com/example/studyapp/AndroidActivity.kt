package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)


        var myRV = findViewById<RecyclerView>(R.id.rvAndroid)
        myRV.adapter = AndroidRecyclerView()
        myRV.layoutManager = LinearLayoutManager(this)
    }
}