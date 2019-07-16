package com.example.muxichallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import io.ktor.client.*
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import org.kotlin.mpp.mobile.createApplicationScreenMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
    }

}
