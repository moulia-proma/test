package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityLoginBinding
import com.example.myapplication.databinding.ActivityMaRegisterBinding

class MaRegisterActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMaRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMaRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtAlreadyHaveAnAccount.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}