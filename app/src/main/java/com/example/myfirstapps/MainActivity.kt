package com.example.myfirstapps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonProject: Button = findViewById(R.id.buttonProject)
        val buttonHobi: Button = findViewById(R.id.buttonHobi)
        val buttonInstagram: Button = findViewById(R.id.buttonInstagram)
        val buttonWA: Button = findViewById(R.id.buttonWA)
        val buttonTiktok: Button = findViewById(R.id.buttonTiktok)

        buttonProject.setOnClickListener {
            val intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }
        buttonHobi.setOnClickListener {
            val intent = Intent(this, HobiActivity::class.java)
            startActivity(intent)
        }
        buttonInstagram.setOnClickListener {
            val instgramUrl = "https://www.instagram.com/knp._06?stkn=MWwzemtoMmkxZHM4YQ=="
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instgramUrl))
            startActivity(intent)
        }
        buttonWA.setOnClickListener {
            val whatsappUrl = "https://wa.me/6282311293977"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(whatsappUrl))
            startActivity(intent)
        }
        buttonTiktok.setOnClickListener {
            val TiktokUrl = "https://www.tiktok.com/@knp._06?_r=1&_t=ZS-99ijUnXV8Kb"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(TiktokUrl))
            startActivity(intent)
        }
    }
}