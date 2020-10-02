package ir.laitec.androidwslaitec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tas);
        final TextView txtNum=findViewById(R.id.txtRandom);
        Button btnTas=findViewById(R.id.btnTas);
        final ImageView imgTas=findViewById(R.id.imgTas);
        
        btnTas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer randomNum=new Random().nextInt(6)+1;
                txtNum.setText(randomNum.toString());

                switch (randomNum){
                    case 1:
                        imgTas.setImageResource(R.drawable.aut);
                        break;
                    case 2:
                        imgTas.setImageResource(R.drawable.bah2);
                        break;
                    case 3:
                        imgTas.setImageResource(R.drawable.bahar);
                        break;
                    case 4:
                        imgTas.setImageResource(R.drawable.cat);
                        break;
                    case 5:
                        imgTas.setImageResource(R.drawable.giphy);
                        break;
                    case 6:
                        imgTas.setImageResource(R.drawable.google);
                        break;

                }
            }
        });
    }
}