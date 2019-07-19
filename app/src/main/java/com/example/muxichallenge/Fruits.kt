package muxi.challenge.api

import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonArray
import muxi.challenge.api.requestUrl
import org.json.JSONObject
import com.google.gson.JsonParser
import com.google.gson.JsonObject
import org.json.JSONArray

data class Fruit(val name: String,val image: String,val price: Any)

class Fruits : getJson {

    //Endpoint to get the fruits
    val url = "https://raw.githubusercontent.com/muxidev/desafio-android/master/fruits.json"

    //Get the json
    override fun sendData(json: String) {
        Log.d("teste: ",json)
        val jsonObject = JSONObject(json)
        val jsonArray : JSONArray = jsonObject.getJSONArray("fruits")
        //val listOfStrings = Gson().fromJson(jsonObject.get("fruits").toString(), mutableListOf<Fruit>()::class.java)
        val fruitsArray = mutableListOf<Fruit>()

        for (i in 0 until jsonArray.length()) {
            val item = jsonArray.getJSONObject(i)
            fruitsArray.add(Fruit(item.get("name").toString(), item.get("image").toString(),
                item.get("price")))
            println(fruitsArray[i].name)
        }
    }

    fun fetchData() {
        requestUrl(url, this)
    }

}