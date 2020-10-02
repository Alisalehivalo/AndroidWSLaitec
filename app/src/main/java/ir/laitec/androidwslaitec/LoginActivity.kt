package ir.laitec.androidwslaitec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnClose.setOnClickListener(View.OnClickListener { finish()
        System.exit(0)})
        btnLogin.setOnClickListener(View.OnClickListener {
            if (isEmpty(edtUsername.text))
            {
                edtUsername.setError("لطفا نام کاربری را وارد نمایید!!!")
            }else if (isEmpty(edtPassword.text))
            {
                edtPassword.setError("لطفا رمز عبور را وارد نمایید")
            }else if (edtPassword.text.length < 8)
            {
                edtPassword.setError("حداقل رمز عبور 8 کاراکتر باشد")
            }else{
                val toast=Toast.makeText(this,"Login ....",Toast.LENGTH_LONG).show()
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

        })

    }
}