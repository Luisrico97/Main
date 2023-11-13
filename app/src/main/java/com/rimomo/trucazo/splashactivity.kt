package com.rimomo.trucazo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class splashactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashactivity)

        val logo = findViewById<ImageView>(R.id.logo)

        logo.setOnClickListener {


            val i = Intent(this, Fragment::class.java)
            startActivity(i)

            finish()

        }

    }
}