package com.example.componentebasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.Toast

class ActivityMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        val botonCalcular:Button=findViewById(R.id.button)
        botonCalcular.setOnClickListener{ Imprimir() }
    }

    private fun Imprimir(){

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val radioGroup = findViewById<RadioGroup>(R.id.idRadioGroup)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val togglebuton = findViewById<ToggleButton>(R.id.toggleButton)
        val switch = findViewById<Switch>(R.id.switch1)


        val texto = "Valor de EditText: ${editText.text}\n" +
                "Valor de RadioGroup: ${radioGroup.checkedRadioButtonId}\n" +
                "Valor de CheckBox1: ${checkBox1.isChecked}\n" +
                "Valor de CheckBox2: ${checkBox2.isChecked}\n" +
                "Valor de ToggleButton: ${togglebuton.isChecked}\n" +
                "Valor de Switch: ${switch.isChecked}"



        Toast.makeText(this, "$texto ", Toast.LENGTH_LONG).show()
    }
}