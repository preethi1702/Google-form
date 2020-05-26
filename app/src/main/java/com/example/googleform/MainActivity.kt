package com.example.googleform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar=findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)
        val checkBox=findViewById<CheckBox>(R.id.checkbox);
        val mybtn=findViewById<Button>(R.id.mybtn);
        val edittext1 = findViewById<EditText>(R.id.text);
        val edittext2=findViewById<EditText>(R.id.text1);
        mybtn.setOnClickListener {
            val Username=edittext1.text.toString()
            val Password=edittext2.text.toString()
            if(Username=="testusername" && Password=="testpassword"){
                val snackbar= Snackbar.make(it,"Login Success",Snackbar.LENGTH_LONG)
                snackbar.setAction("Ok"){
                    println("Ok")
                }
                snackbar.show()
        }

           else{
                val snackbar2=Snackbar.make(it,"Usernamr/Password is incorrect",Snackbar.LENGTH_LONG)
                snackbar2.show()
            }
        }

    }
}


