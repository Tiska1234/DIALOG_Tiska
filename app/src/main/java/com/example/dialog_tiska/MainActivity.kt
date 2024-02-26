package com.example.dialog_tiska

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol = findViewById<Button>(R.id.tombolDialog)

        tombol.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Judul")
                .setMessage("Pesan yang ditampil")
                .setPositiveButton("yes",DialogInterface.OnClickListener{ _, _ ->
                    Toast.makeText(this, "Tombol Yes Ditekan", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { _, _ ->
                    Toast.makeText(this, "Tombol No Ditekan", Toast.LENGTH_LONG)
                })
                .show()
        }
    }
}