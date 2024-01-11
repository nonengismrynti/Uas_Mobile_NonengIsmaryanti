package com.example.waterreserviorapps

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    private var back:ImageView? = null
    private var next:ImageButton? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        back = findViewById(R.id.btn_back)
        next = findViewById(R.id.btn_next2)
        back!!.setOnClickListener{ backpage() }
        next!!.setOnClickListener{ nextpage() }
    }
    private fun backpage(){
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
    }
    private fun nextpage(){
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}