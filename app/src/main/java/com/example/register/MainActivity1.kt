package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.example.register.databinding.ActivityMainBinding

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.non_constrainlayout)
        // Find the Button in the layout
        val rollButton: Button = findViewById(R.id.button2)
        // Set a click listener on the button to roll the dice when the user taps the button
        rollButton.setOnClickListener {

        }

    }
    fun check(button:Button){
        val firstInput: EditText = findViewById(R.id.first_input_1)
        val length_first = firstInput.getText().length
        val lastInput: EditText = findViewById(R.id.last_input_1)
        val length_last = lastInput.getText().length
        val addressInput: EditText = findViewById(R.id.address_input_2)
        val length_address = addressInput.getText().length
        val birthdayInput: EditText = findViewById(R.id.birthday_input_1)
        val length_birthday = birthdayInput.getText().length
        val emailInput: EditText = findViewById(R.id.addddd)
        val length_email = emailInput.getText().length
        val male: RadioButton = findViewById(R.id.maleBTN)
        val female: RadioButton = findViewById(R.id.femaleBTN)
        if(length_first == 0 || length_last == 0 || length_address == 0 || length_birthday == 0 || length_email == 0){
            val text = "Input isn't filled !!!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this,text,duration)
            toast.show()
        } else if (male.isChecked == false && female.isChecked == false){
            val text = "Checkbox isn't filled !!!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this,text,duration)
            toast.show()
        }
    }
}