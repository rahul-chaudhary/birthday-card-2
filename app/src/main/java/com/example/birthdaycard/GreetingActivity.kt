package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaycard.databinding.ActivityGreetingBinding
import com.example.birthdaycard.databinding.ActivityMainBinding

class GreetingActivity: AppCompatActivity() {
    companion object {
     const val NAME_EXTRA = "NAME_EXTRA"
    }
    private lateinit var binding: ActivityGreetingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val birthdayMessage = getString(R.string.happy_birthday) + " " + intent.getStringExtra(
            NAME_EXTRA)
        binding.happyBirthdayText.text = birthdayMessage
    }
}