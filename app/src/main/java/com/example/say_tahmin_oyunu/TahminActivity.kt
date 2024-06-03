package com.example.say_tahmin_oyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.say_tahmin_oyunu.databinding.ActivityMainBinding
import com.example.say_tahmin_oyunu.databinding.ActivityTahminBinding
import kotlin.math.log
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTahminBinding
    private var rastgele_sayi = Random.nextInt(101)/* 0 ile 100 */
    private var sayac=5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTahminBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.btnTahmin.setOnClickListener {
                var tahmin: Int = binding.txtGirdi.text.toString().toInt()
                if (tahmin ==null){
                    Toast.makeText(applicationContext, "boş değer girildi", Toast.LENGTH_LONG).show()

                    startActivity(Intent(this@TahminActivity, TahminActivity::class.java))
                    intent.putExtra("tahmin", false)

                }

                //Toast.makeText(applicationContext, "bilemediniz sayı : $rastgele_sayi---$tahmin---$sayac'idi", Toast.LENGTH_LONG).show()


                sayac = sayac - 1

                if (sayac == 0) {
                    startActivity(Intent(this@TahminActivity, SonucActivity::class.java))
                    intent.putExtra("sonuc", false)
                    Toast.makeText(applicationContext, "bilemediniz sayı : $rastgele_sayi'idi", Toast.LENGTH_LONG).show()
                    finish()
                }

                if (tahmin == rastgele_sayi)
                {

                    startActivity(Intent(this@TahminActivity, SonucActivity::class.java))
                    intent.putExtra("sonuc", true)


                    finish()
                }

                if (tahmin < rastgele_sayi)
                {
                    binding.textYardim.text = "azaltma $sayac"
                }
                if (tahmin > rastgele_sayi)
                {

                    binding.textYardim.text = "azalt $sayac"

                }

                binding.kalanHak.text = "Kalan Hak: $sayac"




                //binding.txtGirdi.setText(" ")
            }








    }
}