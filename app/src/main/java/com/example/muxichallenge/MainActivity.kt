package com.example.muxichallenge

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),MainView, OnClickFruitHandle{
    override fun onClick(fruit: Fruit) {
        Log.d("MainActivity ","Fruta clicada foi ${fruit.name}")
        val intent = Intent(this,DetailsFruitActivity::class.java)
        intent.putExtra("nome",fruit.name)
        intent.putExtra("price",fruit.price.toString())
        intent.putExtra("image",fruit.image)
        startActivity(intent)
    }

    @SuppressLint("WrongConstant")
    override fun callbackListFruits(fruitsArray: ArrayList<Fruit>) {
        Log.d("testeArray", fruitsArray.size.toString())
        var adapter = RecyclerViewAdapter(this, fruitsArray)

        recycler_view.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recycler_view.adapter=adapter

        adapter.setOnClickFruit(this)
    }

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Calling function to get Json
        val data = FetchApi(this)
        data.fetchData()

    }

}
