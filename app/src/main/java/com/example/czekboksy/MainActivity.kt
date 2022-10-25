package com.example.czekboksy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
fun f(i: ImageView, bx: CheckBox){
    if (bx.isChecked()){
        i.visibility=View.VISIBLE
    }
    else{
        i.visibility=View.INVISIBLE
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<CheckBox>(R.id.checkBox).setOnClickListener {
            f(findViewById(R.id.imageView),findViewById(R.id.checkBox))
        }
        findViewById<CheckBox>(R.id.checkBox2).setOnClickListener {
            f(findViewById(R.id.imageView5),findViewById(R.id.checkBox2))
        }
        findViewById<CheckBox>(R.id.checkBox3).setOnClickListener {
            f(findViewById(R.id.imageView4),findViewById(R.id.checkBox3))
        }
        findViewById<CheckBox>(R.id.checkBox4).setOnClickListener {
            f(findViewById(R.id.imageView6),findViewById(R.id.checkBox4))
        }
        findViewById<CheckBox>(R.id.checkBox5).setOnClickListener {
            f(findViewById(R.id.imageView7), findViewById(R.id.checkBox5))
        }
        findViewById<CheckBox>(R.id.checkBox6).setOnClickListener {
            f(findViewById(R.id.imageView8),findViewById(R.id.checkBox6))
        }
        findViewById<CheckBox>(R.id.checkBox7).setOnClickListener {
            f(findViewById(R.id.imageView9),findViewById(R.id.checkBox7))
        }
        findViewById<CheckBox>(R.id.checkBox8).setOnClickListener {
            f(findViewById(R.id.imageView10),findViewById(R.id.checkBox8))
        }
        findViewById<CheckBox>(R.id.checkBox9).setOnClickListener {
            f(findViewById(R.id.imageView11),findViewById(R.id.checkBox9))
        }
        findViewById<CheckBox>(R.id.checkBox10).setOnClickListener {
            f(findViewById(R.id.imageView12),findViewById(R.id.checkBox10))
        }
    }
}