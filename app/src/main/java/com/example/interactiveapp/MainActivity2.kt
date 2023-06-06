package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonLight = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<LinearLayout>(R.id.LinearLayout)

        //Change to light mode
        buttonLight.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)

        }
    }
}