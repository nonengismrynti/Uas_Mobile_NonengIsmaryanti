package com.example.waterreserviorapps

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    private var back:ImageView? = null
    private var start:ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        back = findViewById(R.id.btn_back2)
        start = findViewById(R.id.btn_start)
        back!!.setOnClickListener{ backpage() }
        start!!.setOnClickListener { nextpage() }
    }
    private fun backpage(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    private fun nextpage(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}