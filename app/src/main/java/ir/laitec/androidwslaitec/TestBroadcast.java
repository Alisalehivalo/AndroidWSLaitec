package ir.laitec.androidwslaitec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Air Plane mode Changed !!!",Toast.LENGTH_LONG).show();
    }
}
