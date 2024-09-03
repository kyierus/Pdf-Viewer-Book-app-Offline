package com.rajat.sample.pdfviewer

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class firstActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first) // Make sure this matches your layout file

        val cardView1 = findViewById<CardView>(R.id.cardView1)
        val cardView2 = findViewById<CardView>(R.id.cardView2)

        cardView1.setOnClickListener {
            // Open MainActivity (or any other activity you want to open)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        cardView2.setOnClickListener {
            // Open SecondActivity
            val intent = Intent(this, PoemActivity::class.java)
            startActivity(intent)
        }





    }


}