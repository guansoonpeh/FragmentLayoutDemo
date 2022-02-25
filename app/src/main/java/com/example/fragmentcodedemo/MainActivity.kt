package com.example.fragmentcodedemo

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout:LinearLayout =  findViewById(R.id.myLayout)

        if (resources.configuration.orientation ==  Configuration.ORIENTATION_PORTRAIT ){
            layout.orientation =LinearLayout.VERTICAL
        }else{
            layout.orientation =LinearLayout.HORIZONTAL
        }
    }
}