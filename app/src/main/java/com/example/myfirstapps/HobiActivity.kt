package com.example.myfirstapps

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HobiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hobi)
        val buttonKembaliHobi: Button = findViewById(R.id.buttonKembaliHobi)
        buttonKembaliHobi.setOnClickListener {
            finish()
        }
    }
}