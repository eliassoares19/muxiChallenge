package muxi.challenge.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


    suspend fun fetch(urlString: String): String {
        val client = HttpClient()
        return client.get(urlString)
    }

    fun requestUrl (urlString: String,json: getJson) {
        val scope = CoroutineScope(Dispatchers.Main)
        scope.launch{
            json.sendData(fetch(urlString))
        }
    }

