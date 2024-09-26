package com.example.coconutmicrazy

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("DetailedActivity", "This activity has been destroyed")
    }

    override fun onStart() {
        super.onStart()
        Log.i("DetailedActivity", "This activity has been started")
    }

    override fun onStop() {
        super.onStop()
        Log.i("DetailedActivity", "This activity has been stopped")
    }

    override fun onPause() {
        super.onPause()
        Log.i("DetailedActivity", "This activity has been paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("DetailedActivity", "This activity has been resumed")
    }
}