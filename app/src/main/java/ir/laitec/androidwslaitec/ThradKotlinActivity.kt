package ir.laitec.androidwslaitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThradKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thrad_kotlin)
        val thread=Thread.currentThread().name
        Log.d("MyTAG",thread)
        val thread2=Thread(Runnable { val thread=Thread.currentThread().name
            Log.d("MyTAG2",thread) }).start()
    }
}