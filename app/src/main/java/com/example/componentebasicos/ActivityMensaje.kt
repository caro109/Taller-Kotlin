package com.example.componentebasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ActivityMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        val botonCalcular:Button=findViewById(R.id.button)
        botonCalcular.setOnClickListener{ Imprimir() }
    }

    private fun Imprimir(){

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val editTextValue = editText.text.toString()
        val radioGroup = findViewById<RadioGroup>(R.id.idRadioGroup)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val togglebuton = findViewById<ToggleButton>(R.id.toggleButton)
        val switch = findViewById<Switch>(R.id.switch1)

        Toast.makeText(this, "$editTextValue , $radioGroup seleccionado, $checkBox1 seleccionado, $checkBox2 seleccionado, $togglebuton Seleccionado, $switch ", Toast.LENGTH_LONG).show()
    }
}