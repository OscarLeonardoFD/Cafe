package com.example.cafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Variedades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variedades)
        val editText1 = findViewById<EditText>(R.id.editTextseco)
        val editText2 = findViewById<EditText>(R.id.editTexttostadoclaro)
        val editText3 = findViewById<EditText>(R.id.editTexttostadooscuro)
        val editText4 = findViewById<EditText>(R.id.editTextmolido)
        val editText5 = findViewById<EditText>(R.id.editTextmolidogrueso)
        val editText6 = findViewById<EditText>(R.id.editTexttrillado)
        val buttonCalculate = findViewById<Button>(R.id.button)
        val seco = 50000
        val tostadoclaro = 60000
        val tostadooscuro = 60000
        val molido = 69000
        val molidogrueso = 69000
        val trillado = 50000

        buttonCalculate.setOnClickListener {
            // Obtener los valores ingresados en los EditText
            val quantity1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
            val quantity2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
            val quantity3 = editText3.text.toString().toDoubleOrNull() ?: 0.0
            val quantity4 = editText4.text.toString().toDoubleOrNull() ?: 0.0
            val quantity5 = editText5.text.toString().toDoubleOrNull() ?: 0.0
            val quantity6 = editText6.text.toString().toDoubleOrNull() ?: 0.0


           val total = (quantity1 * seco)+(quantity2 * tostadoclaro)+(quantity3 * tostadooscuro)+(quantity4 * molido)+(quantity5 * molidogrueso)+(quantity6 * trillado)
            // Crear un Intent para pasar a la siguiente actividad
            val intent = Intent(this, pagar::class.java)
            intent.putExtra("TOTAL_AMOUNT", total)
            startActivity(intent)
        }



    }

}