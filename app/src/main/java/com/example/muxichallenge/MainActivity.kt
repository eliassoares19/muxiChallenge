package com.example.muxichallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import muxi.challenge.api.Fruits

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_requestJson.setOnClickListener {
            Toast.makeText(this@MainActivity, "Redirecting...", Toast.LENGTH_SHORT).show()

            //Calling function to get Json
            var data = Fruits()
            data.fetchData()
        }
    }

}
