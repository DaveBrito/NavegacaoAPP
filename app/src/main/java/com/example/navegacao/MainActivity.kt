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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mainLayout: ConstraintLayout = findViewById(R.id.main)  // telas
        val vermelhoButton: Button = findViewById(R.id.vermelho)    //botao vermelho
        val pretoButton: Button = findViewById(R.id.preto)          //botao vermelho
        val nnext: Button = findViewById(R.id.next)                 // botao de proximo
        val amareloButton: Button = findViewById(R.id.amarelo)      //botao amarelo
        val azulButton: Button = findViewById(R.id.azul)            //botao azul



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //removido a variavel de voltar do botao
        //val back: Button = findViewById(R.id.bt_back)


        //funcao para ler o botao proximo
        nnext.setOnClickListener {
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

        /*
        funcao removida de voltar janela, pois não há necessidade de voltar da tela 1

        Anterior.setOnClickListener {
        BacktoPage()
        }
        */

    }

    //funcao para pular pra prx janela
    private fun nextoPage() {
        val tela02 = Intent(this, Tela2::class.java)    // val tela02, nome criado para a funcao
        startActivity(tela02)
    }

    //funcao para alterar a cor de fundo
    private fun changeBackgroundColor(layout: ConstraintLayout, color: Int) {
        layout.setBackgroundColor(color)


    }
}