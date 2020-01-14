package com.example.u1tema1kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class Manipulacion : AppCompatActivity() {

    /*internal abstract var edtnombre: EditText
    internal abstract var edtmonto: EditText
    internal abstract var txtresultado: TextView
    internal abstract var btnejecutar: Button
    internal abstract var btncambiarpropiedad: Button

    internal var edtnombre = findViewById(R.id.edtnombre) as EditText
    internal var edtmonto = findViewById(R.id.edtmonto) as EditText
    internal var txtresultado = findViewById(R.id.txtResultado) as TextView
    internal var btnejecutar = findViewById(R.id.btncambiar) as Button
    internal var btncambiarpropiedad = findViewById(R.id.btnopcion) as Button*/


    /*internal var edtnombre: EditText
    internal var edtmonto: EditText
    internal var txtresultado: TextView
    internal var btnejecutar: Button
    internal var btncambiarpropiedad: Button*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manipulacion2)

        /*edtnombre = findViewById(R.id.edtnombre)
        edtmonto = findViewById(R.id.edtmonto)
        txtresultado = findViewById(R.id.txtResultado)
        btnejecutar = findViewById(R.id.btncambiar)
        btncambiarpropiedad = findViewById(R.id.btnopcion)
        btnejecutar.setOnClickListener {
            val cambio: Double?
            cambio = java.lang.Double.parseDouble(edtmonto.text.toString()) * 3.3
            txtresultado.text = edtnombre.text.toString() + " el monto de " + edtmonto.text +
                    " dolares equivale a " + cambio.toString() + "Soles"
        }*/
    }
/*
    internal var i = 0

    fun ocultar(view: View) {

        btncambiarpropiedad.text = "Mostrar"

        if (i == 0) {
            btnejecutar.visibility = View.GONE
            btncambiarpropiedad.text = "Mostrar"
            i = 1
        } else {
            btnejecutar.visibility = View.VISIBLE
            btncambiarpropiedad.text = "Ocultar"
            i = 0
        }
    }*/
}
