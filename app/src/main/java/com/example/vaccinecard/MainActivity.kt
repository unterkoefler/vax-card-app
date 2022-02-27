package com.example.vaccinecard

import android.os.Bundle
import android.view.ScaleGestureDetector
import androidx.appcompat.app.AppCompatActivity
import com.example.vaccinecard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageView = binding.imageView
        var scaleFactor = 1.0f
        val scaleGestureDetector = ScaleGestureDetector(
            this,
            object : ScaleGestureDetector.SimpleOnScaleGestureListener() {
                override fun onScale(detector: ScaleGestureDetector): Boolean {
                    scaleFactor *= detector.scaleFactor
                    scaleFactor = scaleFactor.coerceIn(0.1f, 5.0f)

                    imageView.scaleX = scaleFactor
                    imageView.scaleY = scaleFactor

                    return super.onScale(detector)
                }
            }
        )

        imageView.setOnTouchListener { _, event ->
            scaleGestureDetector.onTouchEvent(event)
        }
    }
}