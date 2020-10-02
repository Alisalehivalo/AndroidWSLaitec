package ir.laitec.androidwslaitec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        String thread=Thread.currentThread().getName();
        Log.d("MyTag",thread);
        new Thread(new Runnable() {
            @Override
            public void run() {
                String thread=Thread.currentThread().getName();
                Log.d("MyTag2",thread);
            }
        }).start();
    }
}