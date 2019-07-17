package com.example.muxichallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import muxi.challenge.api.requestUrl

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://raw.githubusercontent.com/muxidev/desafio-android/master/fruits.json"

        btn_requestJson.setOnClickListener {
            Toast.makeText(this@MainActivity, "Redirecting...", Toast.LENGTH_SHORT).show()

            requestUrl(url)
            //
        }
    }

}
