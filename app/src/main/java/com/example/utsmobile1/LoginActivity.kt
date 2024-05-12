package com.example.utsmobile1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utsmobile1.R.id.btnlgn
import com.example.utsmobile1.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlgn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        binding.createaccount.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }


    }
}