package com.example.myandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOneName = findViewById<Button>(R.id.button_one_name)

        buttonOneName.setOnClickListener {
//            Toast.makeText(this, "하니 입니다.", Toast.LENGTH_LONG).show()

            var haniIntent = Intent(this, PhotoActivity::class.java)
            startActivity(haniIntent)
        }

    }
}