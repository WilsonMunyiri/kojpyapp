package com.example.kojpy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityCbcclassBinding

private lateinit var binding: ActivityCbcclassBinding

class cbcclass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCbcclassBinding.inflate(layoutInflater)

        setContentView(binding.root)






    }
}