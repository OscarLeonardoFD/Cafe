package com.example.cafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        val edittext = findViewById<EditText>(R.id.editnombre)
        val edittext2 = findViewById<EditText>(R.id.editcontraseña)
        val edittext3 = findViewById<EditText>(R.id.edittelefono)
        val edittext4 = findViewById<EditText>(R.id.editcorreo)
        val button = findViewById<Button>(R.id.bcrear)
        button.setOnClickListener {


        }

    }
}