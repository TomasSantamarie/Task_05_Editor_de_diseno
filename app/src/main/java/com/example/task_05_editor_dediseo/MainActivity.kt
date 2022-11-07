package com.example.task_05_editor_dediseo

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensaje(view: View) {
        
        val newText = findViewById<EditText>(R.id.editTextTextPersonName)
        val mensaje = newText.text.toString()

        val intent = Intent(this, Mensaje_que_aparecera::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensaje)
        }

        startActivity(intent)

    }

}