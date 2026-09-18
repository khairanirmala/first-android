package com.example.myfirstapps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project)
        val buttonGithub: Button = findViewById(R.id.buttonGithub)
        val buttonKembaliProject: Button = findViewById(R.id.buttonKembaliProject)

        buttonKembaliProject.setOnClickListener {
            finish()
        }
        buttonGithub.setOnClickListener {
            val GithubUrl = "https://github.com/khairanirmala/PORTOFOLIO.git"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(GithubUrl))
            startActivity(intent)
        }
    }
}