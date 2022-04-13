package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       Toast.makeText(applicationContext,"OnCreat Function From Second Ativity called", LENGTH_SHORT).show()

        val actionBar = supportActionBar

        actionBar!!.title = "Second Activity"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }


    override fun onStart() {
        super.onStart()

       Toast.makeText(applicationContext,"OnStart Function From Second Ativity called", LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
       Toast.makeText(applicationContext,"onPaused Function From Second Ativity called", LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"onResume Function From Second Ativity called", LENGTH_SHORT).show()

    }

    override fun onRestart() {
        super.onRestart()
       Toast.makeText(applicationContext,"onRestart Function From Second Ativity called", LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop Function From Second Ativity called", LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
       Toast.makeText(applicationContext,"onDestroy Function From Second Ativity called", LENGTH_SHORT).show()
    }
}
