package com.example.final_project_psi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val btn: Button = findViewById(R.id.btnKembali)
        btn.setOnClickListener {
            this.finish()
        }
    }

}