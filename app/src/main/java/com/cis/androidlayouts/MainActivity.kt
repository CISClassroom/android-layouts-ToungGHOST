package com.cis.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            val i =Intent(this,Linaer::class.java)
            startActivity(i)
        }
        button1.setOnClickListener(){
            val i =Intent(this,Relative::class.java)
            startActivity(i)
        }
        button2.setOnClickListener(){
            val i =Intent(this,Constainlaout::class.java)
            startActivity(i)
        }
        button5.setOnClickListener(){
            val i = Intent(this,Profile::class.java)
            startActivity(i)
        }
    }
}
