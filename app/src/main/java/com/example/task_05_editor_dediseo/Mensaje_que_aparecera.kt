package com.example.task_05_editor_dediseo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class Mensaje_que_aparecera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje_que_aparecera)


        val mensaje = intent.getStringExtra(EXTRA_MESSAGE)

        val verTexto = findViewById<TextView>(R.id.textView).apply {
            text = mensaje
        }
    }



}