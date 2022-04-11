package com.firas.constatkt

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class Choice : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        val imageButton5: ImageButton = findViewById(R.id.imageButton5)
        imageButton5.setOnClickListener {
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }
    }
}