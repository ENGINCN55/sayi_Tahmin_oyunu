package com.example.say_tahmin_oyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.say_tahmin_oyunu.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySonucBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTekrar.setOnClickListener{
            startActivity(Intent(this@SonucActivity,MainActivity::class.java))
            finish()
        }




    }


}