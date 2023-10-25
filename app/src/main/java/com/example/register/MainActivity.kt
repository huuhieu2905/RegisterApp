package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.register.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.registerBTN.setOnClickListener{
            check(binding.registerBTN)
        }
    }
    fun check(button:Button){
        val length_first = binding.firstInput.getText().length
        val length_last = binding.lastInput.getText().length
        val length_birthday = binding.birthdayInput.getText().length
        val length_address = binding.addressInput.getText().length
        val length_email = binding.emailInput.getText().length
        if(length_first == 0 || length_last == 0 || length_address == 0 || length_birthday == 0 || length_email == 0){
            val text = "Input isn't filled !!!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this,text,duration)
            toast.show()
        } else if (binding.male.isChecked == false && binding.female.isChecked == false){
            val text = "Checkbox isn't filled !!!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this,text,duration)
            toast.show()
        }
    }
}