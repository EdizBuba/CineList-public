package com.but.cinelist.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.but.cinelist.MainActivity
import com.but.cinelist.R

/** Entry point for the educational demo, not an authentication screen. */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
