package com.example.cl07_dadoalazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var dado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDado = findViewById<Button>(R.id.buttonTirarDado)
        dado = findViewById(R.id.imageViewDado)

        btnDado.setOnClickListener {
            generarDadoAleatorio(dado)
        }

    }

    private fun generarDadoAleatorio(dado: ImageView) {
        var randomInt = Random().nextInt(6) + 1

        when (randomInt) {
            1 -> {dado.setImageResource(R.drawable.uno)}
            2 -> {dado.setImageResource(R.drawable.dos)}
            3 -> {dado.setImageResource(R.drawable.tres)}
            4 -> {dado.setImageResource(R.drawable.cuatro)}
            5 -> {dado.setImageResource(R.drawable.cinco)}
            6 -> {dado.setImageResource(R.drawable.seis)}
            else->{
                dado.setImageResource(R.drawable.cero)
            }
        }
    }
}