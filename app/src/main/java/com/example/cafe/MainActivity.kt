package com.example.cafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.binvitado)

        button.setOnClickListener {
           val intent = Intent (this, tienda::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.bcrearcuenta)

        button2.setOnClickListener {
            val intent = Intent (this, formulario::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.biniciar)

        button3.setOnClickListener {
            val intent = Intent (this, login::class.java)
            startActivity(intent)
        }
    }
}