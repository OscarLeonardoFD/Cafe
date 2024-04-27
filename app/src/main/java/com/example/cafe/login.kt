package com.example.cafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val editname = findViewById<EditText>(R.id.editname)
        val editpasword = findViewById<EditText>(R.id.editpasword)
        val buttoniniciar = findViewById<Button>(R.id.biniciarseccion)

    }
}