package me.ibrahimsn.smoothbottombar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }
    }
}