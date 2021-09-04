package com.example.vbirthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createcard.setOnClickListener {createnewactivity()}
    }

    fun createnewactivity(){
        val name = name.text.toString()
        if (name!=""){
            val intent =
                android.content.Intent(this, com.example.vbirthdaycard.BirthdayCard::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
        else{
            Toast.makeText(applicationContext,"Enter Name",Toast.LENGTH_LONG).show()
        }
    }
}