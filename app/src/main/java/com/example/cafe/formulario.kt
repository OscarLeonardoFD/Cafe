package com.example.cafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.firestore.FirebaseFirestore



class formulario : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()
    private lateinit var formulario : formulario
    val button = findViewById<Button>(R.id.bcrear)
    val editnombre = findViewById<EditText>(R.id.editnombre)
    val editcontraseña = findViewById<EditText>(R.id.editcontraseña)
    val edittelefono = findViewById<EditText>(R.id.edittelefono)
    val editcorreo = findViewById<EditText>(R.id.editcorreo)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        formulario = formulario.inflate(layoutInflater)

        setContentView(R.layout.activity_formulario)


        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message","comenzando app")
        analytics.logEvent("formulario",bundle)

       formulario.button.setOnClickListener {
           val user = hashMapOf(
           "first" to formulario.editnombre.text.toString(),
           "last" to formulario.editcontraseña.text.toString(),
               "last" to formulario.edittelefono.text.toString(),
           "last" to formulario.editcorreo.text.toString()

           )
           db.collection("usuarios")
               .add(user)
               .addOnSuccessListener { documentReference ->
                   Log.d("TAG",documentReference.id )

               }
               .addOnFailureListener{e->
                   Log.w("TAG", "error $e")

               }


       }



        }






    }







