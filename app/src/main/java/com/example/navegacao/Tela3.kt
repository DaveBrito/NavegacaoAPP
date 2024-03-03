package com.example.navegacao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela3)

        val next: Button = findViewById(R.id.bt_prx)


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


    }
    private fun nextoPage() {
        val tela04 = Intent(this, Tela4::class.java)
        startActivity(tela04)
    }
    private fun BacktoPage() {
        val volta = Intent(this, Tela2::class.java)
        startActivity(volta)
    }
}