package com.rajat.sample.pdfviewer

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler to delay the transition to the main activity
        Handler().postDelayed({
            // Start the main activity
            startActivity(Intent(this, firstActivity::class.java))
            // Close the splash activity
            finish()
        }, 2000) // Delay in milliseconds (2000 ms = 2 seconds)
    }
}
