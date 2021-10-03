package com.neeraj.kotlinn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mybtn=findViewById<Button>(R.id.b)
        val mytext=findViewById<TextView>(R.id.t)
        val number1=findViewById<EditText>(R.id.e)
        val number2=findViewById<EditText>(R.id.e1)
        mybtn.setOnClickListener {
            val result = "Result:" + (number2.text.toString().toInt() + number1.text.toString()
                .toInt()).toString()
            mytext.setText(result)
            Toast.makeText(this, "Addition of numbers" + result, Toast.LENGTH_LONG).show()
            for(i in 1..5)
            {
                print(i)
            }
        }

    }
}
