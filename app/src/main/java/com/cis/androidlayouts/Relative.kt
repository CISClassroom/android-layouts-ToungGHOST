package com.cis.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_relative.*

class Relative : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        button3.setOnClickListener(){
            val i = Intent(this,Relative::class.java)
            startActivity(i)
        }
    }

}
