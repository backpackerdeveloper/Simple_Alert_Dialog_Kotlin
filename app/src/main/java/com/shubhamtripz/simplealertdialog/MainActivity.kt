package com.shubhamtripz.simplealertdialog

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boxbtn = findViewById<Button>(R.id.dialobbtn)

        boxbtn.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Alert Dialog Title")
            builder.setMessage("This is a demo message")
            builder.setPositiveButton("OK") {dialog, which ->
                // action here
            }

            builder.setNegativeButton("exit") {dialog, which ->
               finishAffinity()
            }

            val dialog = builder.create()
            dialog.show()

        }

    }
}