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

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela2)


        val next: Button = findViewById(R.id.prx)
        val Anterior: Button = findViewById(R.id.backk)
        val mainLayout: ConstraintLayout = findViewById(R.id.main)  // telas
        val vermelhoButton: Button = findViewById(R.id.vermelho1)    //botao vermelho
        val pretoButton: Button = findViewById(R.id.preto1)          //botao vermelho 
        val amareloButton: Button = findViewById(R.id.amarelo1)      //botao amarelo
        val azulButton: Button = findViewById(R.id.azul1)            //botao azul



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        Anterior.setOnClickListener{
            BacktoPage()
        }

        next.setOnClickListener {
            nextoPage()
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
    private fun nextoPage() {
        val tela03 = Intent(this, Tela3::class.java)
        startActivity(tela03)
    }
    private fun BacktoPage() {
        val volta = Intent(this, MainActivity::class.java)
        startActivity(volta)
    }

    private fun changeBackgroundColor(layout: ConstraintLayout, color: Int) {
        layout.setBackgroundColor(color)

    }
}
