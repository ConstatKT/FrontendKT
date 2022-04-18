package me.ibrahimsn.smoothbottombar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        val signupBtn: Button = findViewById(R.id.btn_signup)
        signupBtn.setOnClickListener {
            val i = Intent(this, SignUp::class.java)
            startActivity(i)
        }
        val loginBtn: Button = findViewById(R.id.button)
        loginBtn.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}