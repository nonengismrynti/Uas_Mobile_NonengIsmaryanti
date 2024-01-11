package com.example.waterreserviorapps


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {

    private var waveView :WaveView? = null
    private var seek_bar : SeekBar? = null
    private var next: ImageView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        next = findViewById(R.id.nextpage)
        next!!.setOnClickListener{ nextpage() }

        initViews()
    }


    private fun initViews() {
        waveView = findViewById(R.id.my_view)
        seek_bar = findViewById(R.id.seek_bar)
        seek_bar!!.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                waveView!!.setProgress(progress.toFloat())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}

        })


        }
    fun nextpage(){
        val intent = Intent(this,ActivityGempa::class.java)
        startActivity(intent)
    }
    }

