package muxi.challenge.api

import android.util.Log
import muxi.challenge.api.requestUrl
import org.json.JSONObject

class Fruits : getJson {

    //Endpoint to get the fruits
    val url = "https://raw.githubusercontent.com/muxidev/desafio-android/master/fruits.json"

    //Get the json
    override fun sendData(json: String) {
        Log.d("teste: ",json)

    }

    fun fetchData() {
        requestUrl(url, this)
    }

}