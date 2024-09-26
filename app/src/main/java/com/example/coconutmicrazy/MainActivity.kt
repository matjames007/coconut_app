package com.example.coconutmicrazy

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moreInfobutton = findViewById<Button>(R.id.button)
        moreInfobutton.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MainActivity", "This activity has been destroyed")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "This activity has been resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "This activity has been paused")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "This activity has been started")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "This activity has been stopped")
    }

    override fun onClick(p0: View?) {
//        Log.v("MainActivity", "This is a verbose message!") //Verbose
//        Log.d("MainActivity", "This is a debug message!") //Debug
//        Log.i("MainActivity", "Just so you know this is happening!") //Information
//        Log.w("MainActivity", "Something bad is about to happen!") //Warning
//        Log.e("MainActivity", "Something horrible went wrong!") //Error
        val detailedActivityIntent = android.content.Intent(this, DetailedActivity::class.java)
        startActivity(detailedActivityIntent)

    }
}