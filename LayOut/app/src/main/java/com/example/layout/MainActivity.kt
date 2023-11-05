package com.example.layout

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOneName = findViewById<Button>(R.id.button_one_name)

        buttonOneName.setOnClickListener {

        }

    }
}