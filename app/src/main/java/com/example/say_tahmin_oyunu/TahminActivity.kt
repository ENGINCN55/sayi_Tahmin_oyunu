package com.example.say_tahmin_oyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.say_tahmin_oyunu.databinding.ActivityMainBinding
import com.example.say_tahmin_oyunu.databinding.ActivityTahminBinding

class TahminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTahminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTahminBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTahmin.setOnClickListener{
            startActivity(Intent(this@TahminActivity,SonucActivity::class.java))
            finish()

        }
    }
}