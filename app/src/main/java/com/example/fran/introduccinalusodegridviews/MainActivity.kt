package com.example.fran.introduccinalusodegridviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var seleccion: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seleccion = findViewById<View>(R.id.seleccion) as TextView?
        val gridView = findViewById<View>(R.id.grid) as GridView
        gridView.adapter = ArrayAdapter(this, R.layout.celda, items)
        gridView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
        seleccion!!.text = items[position]
    }

    companion object {
        private val items = arrayOf("En", "un", "lugar", "de", "la", "Mancha", "de", "cuyo", "nombre",
                "no", "quiero", "acordarme", "no", "ha", "mucho", "tiempo", "que", "vivía", "un",
                "hidalgo", "de", "los", "de", "lanza", "en", "astillero", "adarga", "antigua", "rocín",
                "flaco", "y", "galgo", "corredor")
    }

}

