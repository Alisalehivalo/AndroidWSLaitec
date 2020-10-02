package ir.laitec.androidwslaitec

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class HttpUrlConActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http_url_con)

        Thread {
            try {
                val obj = URL("https://api.aladhan.com/v1/timingsByCity?city=Dubai&country=United%20Arab%20Emirates&method=8")
                val con = obj.openConnection() as HttpURLConnection
                con.requestMethod = "GET"
                con.setRequestProperty("User-Agent", "Mozilla/5.0")
                val responseCode = con.responseCode
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    val input = BufferedReader(InputStreamReader(con.inputStream))
                    var inputLine: String?
                    val response = StringBuffer()
                    while (input.readLine().also { inputLine = it } != null) {
                        response.append(inputLine)
                    }
                    println(response.toString())
                    val obj1 = JSONObject(response.toString())
                    val result = obj1.getString("data")


                    val object1 = JSONObject(result)
                    val result1 = object1.getString("timings")

                    val object2 = JSONObject(result1)
                    val isha = object2.getString("Isha")

                    println(isha)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.start()


    }
}