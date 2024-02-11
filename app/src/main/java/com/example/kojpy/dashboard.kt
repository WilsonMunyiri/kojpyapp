package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.kojpy.databinding.ActivityDashboardBinding

private lateinit var binding: ActivityDashboardBinding


class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.programmingoverviewtext.setOnClickListener {

                    val intent=Intent(this@dashboard, programmingclass::class.java)
            startActivity(intent)
        }


        binding.cbcoverviewtext.setOnClickListener {

            val intent=Intent(this@dashboard, cbcclass::class.java )
            startActivity(intent)
        }

        showGIF()

    }

    fun showGIF(){
        val imageView:ImageView = findViewById(R.id.imageviewgifdashboard)
        Glide.with(this).load(R.drawable.dashboardgif).into(imageView)


    }
}