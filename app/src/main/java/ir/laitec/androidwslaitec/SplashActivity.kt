package ir.laitec.androidwslaitec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Glide.with(this).load(R.drawable.giphy).into(imgSplash)


    }
    fun nextActivity(view: View){
        val intent=Intent(this,LoginActivity::class.java)
        startActivity(intent)

    }
}