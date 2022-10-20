package com.example.midtermexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var button :Button
    private lateinit var sendText:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btSend)
        sendText = findViewById(R.id.etText)
        button.setOnClickListener{
            val fragment = TextFragment()
            val bundle = Bundle()
            bundle.putString("string",sendText.text.toString())
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment)
                .commit()
        }
    }
}