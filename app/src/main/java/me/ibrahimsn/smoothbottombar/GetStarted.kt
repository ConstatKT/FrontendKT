package me.ibrahimsn.smoothbottombar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
        val signinBtn: Button = findViewById(R.id.button2)
        signinBtn.setOnClickListener {
            val i = Intent(this, Choice::class.java)
            startActivity(i)
        }
    }
}