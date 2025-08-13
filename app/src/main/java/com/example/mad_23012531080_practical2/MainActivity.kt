package com.example.mad_23012531080_practical2


import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    val TAG="Mainactivity"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i(TAG, "onCreate: ")
        makeText(this, "activity", Toast.LENGTH_SHORT).show()

        val text ="Hello toast"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration)
        toast.show()


    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
        makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
        makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
        makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
        makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onDestroy: ")
    }
    override fun onRestart() {
        super.onRestart()
        makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onRestart: ")
    }
}




