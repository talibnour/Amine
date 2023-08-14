package com.example.amine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buffl: Button = findViewById(R.id.buffalo)
        val hypo: Button = findViewById(R.id.hypo)
        val rhinoss: Button = findViewById(R.id.rhinos)
        hypo.setOnClickListener {

            hypopo()





        }
        buffl.setOnClickListener {

            buffalo()




        }

        rhinoss.setOnClickListener {

            rhinono()





        }






        
    }

    private fun rhinono() {
        val affich:ImageView =findViewById(R.id.image)
        affich.setImageResource(R.drawable.rhino)
    }

    private fun buffalo() {
        val affich:ImageView =findViewById(R.id.image)
        affich.setImageResource(R.drawable.buffl)
    }

    private fun hypopo() {
       val affich:ImageView =findViewById(R.id.image)
        affich.setImageResource(R.drawable.hypo)
    }
}