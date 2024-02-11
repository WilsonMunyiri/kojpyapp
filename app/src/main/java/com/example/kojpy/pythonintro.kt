package com.example.kojpy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityPythonintroBinding


private lateinit var binding: ActivityPythonintroBinding

class pythonintro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPythonintroBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}