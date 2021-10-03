package com.neeraj.kotlinn

import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_paypal.*

class paypal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paypal)
        large.setOnClickListener {
            text.setTextSize(50f)
        }
        med.setOnClickListener {
            text.setTextSize(30f)
        }
        small.setOnClickListener {
            text.setTextSize(10f)
        }
        button.setOnClickListener(View.OnClickListener {
            //intent =Intent(applicationContext,MainActivity::class.java)

            //=Intent(this,MainActivity::class.java)
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/"))
        })
    }
}
