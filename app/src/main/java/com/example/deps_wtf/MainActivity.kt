package com.example.deps_wtf

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Does AS resolve this method?
        // And if you comment out `implementation project(":lib")`?
        invalidateMenu()
        (this as MenuHost).let {
            invalidateMenu()
            findViewById<TextView>(R.id.txt).text = "Activity is MenuHost"
        }
    }
}