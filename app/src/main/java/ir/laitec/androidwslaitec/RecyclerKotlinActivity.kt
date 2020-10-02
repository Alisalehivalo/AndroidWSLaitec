package ir.laitec.androidwslaitec

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_kotlin.*

class RecyclerKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_kotlin)
        val list=ArrayList<String>()

        list.add("Ali")
        list.add("Akbar")
        list.add("Hasan")
        list.add("Mohammad")
        list.add("Hossein")
        list.add("Fatemeh")
        list.add("Sajad")
        list.add("Ali")
        list.add("Akbar")
        list.add("Hasan")
        list.add("Mohammad")
        list.add("Hossein")
        list.add("Fatemeh")
        list.add("Sajad")
        list.add("Ali")
        list.add("Akbar")
        list.add("Hasan")
        list.add("Mohammad")
        list.add("Hossein")
        list.add("Fatemeh")
        list.add("Sajad")
        list.add("Ali")
        list.add("Akbar")
        list.add("Hasan")
        list.add("Mohammad")
        list.add("Hossein")
        list.add("Fatemeh")
        list.add("Sajad")
        list.add("Ali")
        list.add("Akbar")
        list.add("Hasan")
        list.add("Mohammad")
        list.add("Hossein")
        list.add("Fatemeh")
        list.add("Sajad")
        list.add("Ali")
        list.add("Akbar")
        list.add("Hasan")
        list.add("Mohammad")
        list.add("Hossein")
        list.add("Fatemeh")
        list.add("Sajad")
        val adapter=RecyclerAdapterKotlin(list)
        recyclerKotlin.setAdapter(adapter)
        recyclerKotlin.setLayoutManager(LinearLayoutManager(this,RecyclerView.VERTICAL,false))


    }
}