package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"OnCreat Function From First Ativity called",Toast.LENGTH_SHORT).show()

        val actionBar = supportActionBar

        actionBar!!.title = "Main Activity"

        val button = findViewById<Button>(R.id.nextButton)
        button.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }




    override fun onStart() {
        super.onStart()

        Toast.makeText(applicationContext,"OnStart Function From First Ativity called",Toast.LENGTH_SHORT).show()

//        val toast = Toast.makeText(applicationContext, "Hello Javatpoint", Toast.LENGTH_SHORT)
//        toast.show()
//
//        val myToast = Toast.makeText(applicationContext,"toast message with gravity",Toast.LENGTH_SHORT)
//        myToast.setGravity(Gravity.LEFT,200,200)
//        myToast.show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext,"onPaused Function From First Ativity called",Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"onResume Function From First Ativity called",Toast.LENGTH_SHORT).show()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext,"onRestart Function From First Ativity called",Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop Function From First Ativity called",Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"onDestroy Function From First Ativity called",Toast.LENGTH_SHORT).show()
    }
}
