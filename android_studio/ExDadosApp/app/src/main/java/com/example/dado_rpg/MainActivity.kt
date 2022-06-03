package com.example.dado_rpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD4 = findViewById<Button>(R.id.buttond4)
        val buttonD6 = findViewById<Button>(R.id.buttond6)
        val buttonD8 = findViewById<Button>(R.id.buttond8)
        val buttonD12 = findViewById<Button>(R.id.buttond12)

        buttonD4.setOnClickListener{
            //Toast.makeText(this,"Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(4)
        }
        buttonD6.setOnClickListener{
            //Toast.makeText(this,"Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }
        buttonD8.setOnClickListener{
            //Toast.makeText(this,"Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(8)
        }
        buttonD12.setOnClickListener{
            //Toast.makeText(this,"Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(12)
        }

    }
    private fun rolarDados(lados: Int){
        val rolagem = (1..lados).random()

        val imagemDado = findViewById<ImageView>(R.id.imageLados)

        when(rolagem){
            1 -> imagemDado.setImageResource(R.drawable.d121)
            2 -> imagemDado.setImageResource(R.drawable.d122)
            3 -> imagemDado.setImageResource(R.drawable.d123)
            4 -> imagemDado.setImageResource(R.drawable.d124)
            5 -> imagemDado.setImageResource(R.drawable.d125)
            6 -> imagemDado.setImageResource(R.drawable.d126)
            7 -> imagemDado.setImageResource(R.drawable.d127)
            8 -> imagemDado.setImageResource(R.drawable.d128)
            9 -> imagemDado.setImageResource(R.drawable.d129)
            10 -> imagemDado.setImageResource(R.drawable.d1210)
            11 -> imagemDado.setImageResource(R.drawable.d1211)
            12 -> imagemDado.setImageResource(R.drawable.d1212)

        }        }

}

