package com.example.muxichallenge

import android.util.Log
import muxi.challenge.api.getJson
import muxi.challenge.api.requestUrl
import org.json.JSONArray
import org.json.JSONObject

class FetchApi(var mainView: MainView) : getJson {

    private var fruitsArray = ArrayList<Fruit>()

    //Endpoint to get the fruits
    private val url = "https://raw.githubusercontent.com/muxidev/desafio-android/master/fruits.json"

    //Get the json and add all the fruits into an Array
    override fun sendData(json: String) {
        Log.d("teste: ",json)
        val jsonObject = JSONObject(json)
        val jsonArray : JSONArray = jsonObject.getJSONArray("fruits")
        //val listOfStrings = Gson().fromJson(jsonObject.get("fruits").toString(), mutableListOf<Fruit>()::class.java)

        for (i in 0 until jsonArray.length()) {
            val item = jsonArray.getJSONObject(i)
            fruitsArray.add(
                Fruit(
                    item.get("name").toString(), item.get("image").toString(),
                    item.get("price")
                )
            )
            println(fruitsArray[i].name)
        }
        mainView.callbackListFruits(fruitsArray)

    }

    //Comunicates with Api from Kotlin Native
    fun fetchData() {
        requestUrl(url, this)

    }

}