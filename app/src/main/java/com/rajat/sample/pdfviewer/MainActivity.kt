package com.rajat.sample.pdfviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.rajat.pdfviewer.PdfViewerActivity
import com.rajat.pdfviewer.util.saveTo
import com.rajat.sample.pdfviewer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main) // Make sure this matches your layout file
        setContentView(binding.root)

        // Find the CardViews by their IDs
        val cardPdf1: CardView = findViewById(R.id.cardPdf1)
        val cardPdf2: CardView = findViewById(R.id.cardPdf2)
        val cardPdf3: CardView = findViewById(R.id.cardPdf3)
        val cardPdf4: CardView = findViewById(R.id.cardPdf4)
        val cardPdf5: CardView = findViewById(R.id.cardPdf5)
        val cardPdf6: CardView = findViewById(R.id.cardPdf6)
        val cardPdf7: CardView = findViewById(R.id.cardPdf7)
        val cardPdf8: CardView = findViewById(R.id.cardPdf8)
        val cardPdf9: CardView = findViewById(R.id.cardPdf9)
        val cardPdf10: CardView = findViewById(R.id.cardPdf10)
        val cardPdf11: CardView = findViewById(R.id.cardPdf11)

        val cardPdf12: CardView = findViewById(R.id.cardPdf12)

        val cardPdf13: CardView = findViewById(R.id.cardPdf13)

        val cardPdf14: CardView = findViewById(R.id.cardPdf14)

        val cardPdf15: CardView = findViewById(R.id.cardPdf15)

        val cardPdf16: CardView = findViewById(R.id.cardPdf16)

        val cardPdf17: CardView = findViewById(R.id.cardPdf17)









        // Set click listeners to open the PDFs
        cardPdf1.setOnClickListener {
            launchPdfFromAssets("Fading_Away.pdf")
        }

        cardPdf2.setOnClickListener {
            launchPdfFromAssets("God_Is_Dead.pdf")
        }

        cardPdf3.setOnClickListener {
            launchPdfFromAssets("love_and_war.pdf")
        }

        cardPdf4.setOnClickListener {
            launchPdfFromAssets("a_book_next_shelf.pdf")
        }

        cardPdf5.setOnClickListener {
            launchPdfFromAssets("ninety_four_million.pdf")
        }

        cardPdf6.setOnClickListener {
            launchPdfFromAssets("Imaginary_Friends.pdf")
        }

        cardPdf7.setOnClickListener {
            launchPdfFromAssets("Away.pdf")
        }

        cardPdf8.setOnClickListener {
            launchPdfFromAssets("Untold_Story.pdf")
        }

        cardPdf9.setOnClickListener {
            launchPdfFromAssets("Keep_Your_Dream.pdf")
        }

        cardPdf10.setOnClickListener {
            launchPdfFromAssets("Looking_At_Mirror.pdf")
        }

        cardPdf11.setOnClickListener {
            launchPdfFromAssets("The_Cracked_Pot.pdf")
        }

        cardPdf12.setOnClickListener {
            launchPdfFromAssets("Think_Before_You_Judge.pdf")
        }

        cardPdf13.setOnClickListener {
            launchPdfFromAssets("struggles_of_life.pdf")
        }
        cardPdf14.setOnClickListener {
            launchPdfFromAssets("lesson_learned.pdf")
        }
        cardPdf15.setOnClickListener {
            launchPdfFromAssets("little_boys.pdf")
        }
        cardPdf16.setOnClickListener {
            launchPdfFromAssets("father_to_the_rescue.pdf")
        }
        cardPdf17.setOnClickListener {
            launchPdfFromAssets("the_butterflies.pdf")
        }
    }

    private fun launchPdfFromAssets(pdfFileName: String) {
        startActivity(
            PdfViewerActivity.launchPdfFromPath(
                context = this,
                path = pdfFileName,
                pdfTitle = "PDF Viewer",
                saveTo = saveTo.ASK_EVERYTIME,
                fromAssets = true
            )
        )
    }
}
