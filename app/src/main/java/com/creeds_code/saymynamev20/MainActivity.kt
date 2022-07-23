package com.creeds_code.saymynamev20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.creeds_code.saymynamev20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayName()

    }

   private fun displayName(){
       var name = binding.nameInput.text.toString()
       binding.name.text = name
       Toast.makeText(this,name,LENGTH_SHORT).show()
   }
}