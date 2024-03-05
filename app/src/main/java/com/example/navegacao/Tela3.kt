package com.example.navegacao

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela3)

        val next: Button = findViewById(R.id.bt_prx)
        val mainLayout: ConstraintLayout = findViewById(R.id.main)  // telas
        val vermelhoButton: Button = findViewById(R.id.vermelho)    //botao vermelho
        val aleatorioButton: Button = findViewById(R.id.aleatorio)          //botao aleatorio
        val verdeButton: Button = findViewById(R.id.verde)      //botao verde
        val azulButton: Button = findViewById(R.id.azul)            //botao azul


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Anterior: Button = findViewById(R.id.bt_back)

        Anterior.setOnClickListener{
            BacktoPage()
        }

        next.setOnClickListener {
            nextoPage()
        }
        azulButton.setOnClickListener {
            changeBackgroundColor(mainLayout, Color.BLUE) // ja fez a definicao da cor direto por aqui
        }

        verdeButton.setOnClickListener {
            changeBackgroundColor(mainLayout, Color.GREEN) // ja fez a definicao da cor direto por aqui
        }

        aleatorioButton.setOnClickListener(View.OnClickListener { // Gera uma cor aleatória e define como cor de fundo
            val corAleatoria = Color.rgb(
                (Math.random() * 256).toInt(),
                (Math.random() * 256).toInt(),
                (Math.random() * 256).toInt()
            )
            mainLayout.setBackgroundColor(corAleatoria)
        })
        //funcao para ler o botao vermelho
        vermelhoButton.setOnClickListener {
            changeBackgroundColor(mainLayout, Color.RED) // ja fez a definicao da cor direto por aqui
        }
    }
    //prx tela
    private fun nextoPage() {
        val tela04 = Intent(this, Tela4::class.java)
        startActivity(tela04)
    }
    //volta anterior tela
    private fun BacktoPage() {
        val volta = Intent(this, Tela2::class.java)
        startActivity(volta)
    }
    private fun changeBackgroundColor(layout: ConstraintLayout, color: Int) {
        layout.setBackgroundColor(color)

    }
}