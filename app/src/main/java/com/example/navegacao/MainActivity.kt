package com.example.navegacao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val nnext: Button = findViewById(R.id.next)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btAnterior: Button = findViewById(R.id.back)

        btAnterior.setOnClickListener{
            BacktoPage()
        }

        nnext.setOnClickListener {
            nextoPage()
        }


    }
    private fun nextoPage() {
        val tela02 = Intent(this, Tela2::class.java)
        startActivity(tela02)
    }
    private fun BacktoPage() {
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }
}