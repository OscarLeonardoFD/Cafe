package com.example.cafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class formulario : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()

        val emailEditText = findViewById<EditText>(R.id.editcorreo)
        val passwordEditText = findViewById<EditText>(R.id.editcontraseña)
        val nombreEditText = findViewById<EditText>(R.id.editnombre)
        val telefonoEditText = findViewById<EditText>(R.id.edittelefono)
        val registerButton = findViewById<Button>(R.id.bcrear)

        registerButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val nombre = nombreEditText.text.toString()
            val telefono = telefonoEditText.text.toString()

            auth.createUserWithEmailAndPassword(email, password, )
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // El usuario se registró exitosamente
                        val userId = auth.currentUser?.uid

                        // Guardar los datos adicionales en Firebase Realtime Database
                        userId?.let { uid ->
                            val userRef = database.getReference("users").child(uid)
                            val userData = HashMap<String, Any>()
                            userData["name"] = nombre
                            userData["email"] = email
                            userData["phone"] = telefono
                            userRef.setValue(userData)
                                .addOnSuccessListener {

                                    Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                                    val intent = Intent(this, login::class.java)
                                    startActivity(intent)
                                    finish()
                                }
                                .addOnFailureListener {


                                }
                        }


                    } else {
                        Toast.makeText(this, "Registro  fallido", Toast.LENGTH_SHORT).show()
                    }
                    }
                }
        }
    }



