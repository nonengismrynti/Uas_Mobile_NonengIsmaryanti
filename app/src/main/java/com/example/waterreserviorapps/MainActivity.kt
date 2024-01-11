package com.example.waterreserviorapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decorView = window.decorView
        val uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN
        decorView.systemUiVisibility = uiOptions
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        Handler().postDelayed({
            startActivity(
                Intent(
                    this@MainActivity,
                    FirstActivity::class.java
                )
            )
        },2000)
    }
}