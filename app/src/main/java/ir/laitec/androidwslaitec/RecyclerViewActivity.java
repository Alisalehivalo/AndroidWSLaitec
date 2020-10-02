package ir.laitec.androidwslaitec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView=findViewById(R.id.recycler);
        ArrayList<String> list=new ArrayList<>();
        list.add("Ali"); list.add("Akbar"); list.add("Hasan");list.add("Mohammad");list.add("Hossein");list.add("Fatemeh");list.add("Sajad");
        list.add("Ali"); list.add("Akbar"); list.add("Hasan");list.add("Mohammad");list.add("Hossein");list.add("Fatemeh");list.add("Sajad");
        list.add("Ali"); list.add("Akbar"); list.add("Hasan");list.add("Mohammad");list.add("Hossein");list.add("Fatemeh");list.add("Sajad");
        list.add("Ali"); list.add("Akbar"); list.add("Hasan");list.add("Mohammad");list.add("Hossein");list.add("Fatemeh");list.add("Sajad");
        list.add("Ali"); list.add("Akbar"); list.add("Hasan");list.add("Mohammad");list.add("Hossein");list.add("Fatemeh");list.add("Sajad");
        list.add("Ali"); list.add("Akbar"); list.add("Hasan");list.add("Mohammad");list.add("Hossein");list.add("Fatemeh");list.add("Sajad");
        RecyclerAdapter adapter=new RecyclerAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this,RecyclerView.VERTICAL,false));
    }
}