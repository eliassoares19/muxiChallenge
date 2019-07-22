package com.example.muxichallenge

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),MainView {

    @SuppressLint("WrongConstant")
    override fun callbackListFruits(fruitsArray: ArrayList<Fruit>) {
        Log.d("testeArray", fruitsArray.size.toString())
        var adapter = RecyclerViewAdapter(this, fruitsArray)

        recycler_view.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recycler_view.adapter=adapter
    }

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
//        btn_requestJson.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Redirecting...", Toast.LENGTH_SHORT).show()

            //Calling function to get Json
            val data = FetchApi(this)
            data.fetchData()

    }

}
