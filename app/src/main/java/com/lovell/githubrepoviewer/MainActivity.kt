package com.lovell.githubrepoviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.appComponent.injectMainActivity(this)
        setContentView(R.layout.activity_main)
    }
}
