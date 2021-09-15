package com.gap.gapscanner

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gap.gapscannerlibrary.TestItem

class GapScannerAndroidApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_app)

        val push = findViewById<Button>(R.id.pushBtn)
        val text = findViewById<TextView>(R.id.displayTxt)

        var name = TestItem("George")

        push.setOnClickListener() {
            text.setText("Hello " + name.getName())
            Log.d("---------Name---------", name.getName())
        }
    }
}