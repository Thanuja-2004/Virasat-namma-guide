package com.example.virasatnammaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.virasatnammaguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExplore.setOnClickListener {
            val intent = Intent(this, SiteDetailActivity::class.java)
            intent.putExtra("title", "Hampi Temple")
            intent.putExtra("desc", "A UNESCO heritage site famous for Vijayanagara architecture.")
            startActivity(intent)
        }

        binding.btnQr.setOnClickListener {
            binding.txtStatus.text = "Mock QR Scanned Successfully!"
        }

        binding.btnCheckin.setOnClickListener {
            binding.txtStatus.text = "Check-in completed. Passport updated!"
        }
    }
}