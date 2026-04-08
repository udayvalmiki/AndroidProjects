package com.example.toastapp

import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var btnIncrease: FloatingActionButton
    private lateinit var btnDecrease: FloatingActionButton

    private var currentSize = 24f
    private val minSize = 14f
    private val maxSize = 60f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        btnIncrease = findViewById(R.id.btnIncrease)
        btnDecrease = findViewById(R.id.btnDecrease)

        btnIncrease.setOnClickListener {
            if (currentSize < maxSize) {
                currentSize += 2f
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, currentSize)
            }
        }

        btnDecrease.setOnClickListener {
            if (currentSize > minSize) {
                currentSize -= 2f
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, currentSize)
            }
        }
    }
}
