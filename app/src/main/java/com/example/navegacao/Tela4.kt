package com.example.navegacao

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela4)

        //desabilitado a variavel do botao avancar
        //val next: Button = findViewById(R.id.btnext)
        val mainLayout: ConstraintLayout = findViewById(R.id.main)  // telas
        val vermelhoButton: Button = findViewById(R.id.vermelho3)    //botao vermelho
        val pretoButton: Button = findViewById(R.id.preto3)          //botao vermelho // botao de proximo
        val amareloButton: Button = findViewById(R.id.amarelo3)      //botao amarelo
        val azulButton: Button = findViewById(R.id.azul3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Anterior: Button = findViewById(R.id.btback)

        Anterior.setOnClickListener{
            BacktoPage()
        }
        azulButton.setOnClickListener {
            changeBackgroundColor(mainLayout, Color.BLUE) // ja fez a definicao da cor direto por aqui
        }

        amareloButton.setOnClickListener {
            changeBackgroundColor(mainLayout, Color.YELLOW) // ja fez a definicao da cor direto por aqui
        }

        pretoButton.setOnClickListener {
            changeBackgroundColor(mainLayout, Color.BLACK) // ja fez a definicao da cor direto por aqui
        }
        //funcao para ler o botao vermelho
        vermelhoButton.setOnClickListener {
            changeBackgroundColor(mainLayout, Color.RED) // ja fez a definicao da cor direto por aqui
        }

    }

    private fun BacktoPage() {
        val volta = Intent(this, Tela3::class.java)
        startActivity(volta)
    }
    private fun changeBackgroundColor(layout: ConstraintLayout, color: Int) {
        layout.setBackgroundColor(color)

    }
}