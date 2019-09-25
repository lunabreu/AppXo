package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView ivSmile;
    Button btMudar;
    TextView tVMudar;
    int cont;
    int n;
    int[] imagemId = new int[]{
            R.drawable.smile01,
            R.drawable.smile02,
            R.drawable.smile03,
            R.drawable.smile04,
            R.drawable.smile05,
            R.drawable.smile06,
            R.drawable.smile07,
            R.drawable.smile08,
            R.drawable.smile09,
            R.drawable.smile10,
            R.drawable.smile11,


    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivSmile = findViewById(R.id.ivSmile);
        btMudar = findViewById(R.id.btMudar);
        tVMudar = findViewById(R.id.tVMudar);
        cont=0;
        btMudar.setOnClickListener(new View.OnClickListener() {
            @Override
            //ivSmile.setImageResource(R.drawable.smile02);
            public void onClick(View view) {
                n++;
                if(n % 10 == 0 && cont < 10){
                    cont++;
                    if(cont == 109){
                        cont = 0;
                    }
                }
                ivSmile.setImageResource(imagemId[cont]);
                tVMudar.setText("" + n);
            }


        });

    }




}
