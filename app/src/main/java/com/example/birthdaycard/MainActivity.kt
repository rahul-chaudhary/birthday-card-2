package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.birthdaycard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.generateButton.setOnClickListener {
            val name = binding.nameTextField.text.toString()
            val greetingIntent = Intent(this, GreetingActivity::class.java).apply {
                putExtra(GreetingActivity.NAME_EXTRA, name)
                Log.d("Name log", name)
            }
            startActivity(greetingIntent)
        }
    }
}