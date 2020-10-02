package ir.laitec.androidwslaitec

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_html_kotlin.*

@Suppress("DEPRECATION")
class HtmlKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html_kotlin)
        txtHtml2.setText(
            Html.fromHtml(
                """
                <html>
                <body>
                
                <h1>My First Heading</h1>
                
                <p>My first paragraph.</p>
                
                </body>
                </html>
                """.trimIndent()
            )
        )
    }
}