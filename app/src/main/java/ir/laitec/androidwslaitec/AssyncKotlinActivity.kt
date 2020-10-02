package ir.laitec.androidwslaitec

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.JsonHttpResponseHandler
import cz.msebera.android.httpclient.Header
import ir.laitec.androidwslaitec.pray.PrayJson
import org.json.JSONException
import org.json.JSONObject

class AssyncKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assync_kotlin)
        val client=AsyncHttpClient()
        val address="https://api.aladhan.com/v1/timingsByCity?city=Dubai&country=Iran&method=8"
        client.get(address,object: JsonHttpResponseHandler(){
            override fun onSuccess(statusCode: Int,headers: Array<out Header>?,response: JSONObject?) {
                super.onSuccess(statusCode, headers, response)
                val gson=Gson()
                val pray=gson.fromJson(response.toString(),PrayJson::class.java)
                println(pray.data.timings.isha)
            }
            override fun onFailure(statusCode: Int,headers: Array<out Header>?,throwable: Throwable?,errorResponse: JSONObject?) {
                super.onFailure(statusCode, headers, throwable, errorResponse)
                println(throwable?.message)
            }
        })
    }
}