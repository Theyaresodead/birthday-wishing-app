package com.example.birthdaygreet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreeting : AppCompatActivity() {
    companion object{
        const val NAME_E="name_e"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name=intent.getStringExtra(NAME_E)
        bg.text= "Happy Birthday\n $name"
    }
}