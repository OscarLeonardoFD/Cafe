package com.example.cafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pagar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagar)
        val texttotal = findViewById<TextView>(R.id.texttotal)
        //recibirlo del otro activity
        val totalAmount = intent.getDoubleExtra("TOTAL_AMOUNT", 0.0)
        texttotal.text ="Total: $totalAmount"




    }
}