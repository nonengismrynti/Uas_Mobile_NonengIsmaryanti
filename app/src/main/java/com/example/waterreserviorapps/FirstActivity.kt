package com.example.waterreserviorapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class FirstActivity : AppCompatActivity() {
    private var next:ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        next = findViewById(R.id.btn_next)
        next!!.setOnClickListener{ nextpage() }
    }
    private fun nextpage(){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}