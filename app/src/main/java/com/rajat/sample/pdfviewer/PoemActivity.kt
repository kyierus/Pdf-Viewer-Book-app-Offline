package com.rajat.sample.pdfviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.rajat.pdfviewer.PdfViewerActivity
import com.rajat.pdfviewer.util.saveTo
import com.rajat.sample.pdfviewer.databinding.ActivityPoemBinding

class PoemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPoemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPoemBinding.inflate(layoutInflater)
        setContentView(binding.root) // Use the binding root here

        // Find the CardViews by their IDs using binding
        val cardPdf1: CardView = binding.cardPdf20
        val cardPdf7: CardView = binding.cardPdf21

        // Set click listeners to open the PDFs
        cardPdf1.setOnClickListener {
            launchPdfFromAssets("Fading_Away.pdf")
        }

        cardPdf7.setOnClickListener {
            launchPdfFromAssets("Away.pdf")
        }
    }

    private fun launchPdfFromAssets(pdfFileName: String) {
        startActivity(
            PdfViewerActivity.launchPdfFromPath(
                context = this,
                path = pdfFileName,
                pdfTitle = "PDF Viewer",
                saveTo = saveTo.ASK_EVERYTIME, // Ensure this is properly imported
                fromAssets = true
            )
        )
    }
}
