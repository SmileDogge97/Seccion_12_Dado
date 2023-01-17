package com.example.cl07_dadoalazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.cl07_dadoalazar.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonTirarDado.setOnClickListener {
            generarDadoAleatorio(binding.imageViewDado)
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