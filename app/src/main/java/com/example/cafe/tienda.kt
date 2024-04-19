package com.example.cafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tienda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tienda)
        val button = findViewById<Button>(R.id.bvariedades)

        button.setOnClickListener {
            val intent = Intent (this, Variedades::class.java)
            startActivity(intent)
        }


    }
}