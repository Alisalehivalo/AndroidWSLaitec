package ir.laitec.androidwslaitec

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TestBroadcastKT : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val toast=Toast.makeText(p0,"Airplane Mode Changed!!!",Toast.LENGTH_LONG).show()

    }
}