package ir.laitec.androidwslaitec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import ir.laitec.androidwslaitec.pray.PrayJson;

public class AssyncJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assync_java);
        AsyncHttpClient client = new AsyncHttpClient();
        String address = "https://api.aladhan.com/v1/timingsByCity?city=Dubai&country=Iran&method=8";
        client.get(address, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Gson gson=new Gson();
                PrayJson pray=gson.fromJson(response.toString(),PrayJson.class);
                System.out.println(pray.getData().getTimings().getIsha());
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                System.out.println(throwable.getMessage());
            }
        });
    }
}