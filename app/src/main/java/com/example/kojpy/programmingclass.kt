package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityProgrammingclassBinding


private lateinit var binding: ActivityProgrammingclassBinding

class programmingclass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityProgrammingclassBinding.inflate(layoutInflater)
        setContentView(binding.root)



              binding.javascript.setOnClickListener {
                  val intent = Intent(this@programmingclass, javascriptintro::class.java)
                  startActivity(intent)
              }



          binding.kotlin.setOnClickListener {

              val intent = Intent(this@programmingclass, kotlinintro::class.java)
              startActivity(intent)

          }
         binding.python.setOnClickListener {


             val intent= Intent(this@programmingclass, pythonintro::class.java)
             startActivity(intent)
         }


    }
}