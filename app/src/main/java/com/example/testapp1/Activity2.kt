package com.example.testapp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var infoFromMain = intent.getStringExtra("slowo")
        var inputValue = intent.getStringExtra("inputValue")
        findViewById<TextView>(R.id.textView1).text = infoFromMain + " " + inputValue


        val btn1:Button = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener{
            var inputText = findViewById<EditText>(R.id.editText1).text.toString()
            intent.putExtra("answer", inputText)
            setResult(RESULT_OK, intent)
            finish()

        }
    }

}
