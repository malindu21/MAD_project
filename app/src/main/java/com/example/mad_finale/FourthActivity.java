package com.example.mad_finale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    Button bt,btnUpcoming;
    RadioButton r1;
    EditText cn,my,sc;
    Switch saveCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        r1 = findViewById(R.id.addCard);

        cn = findViewById(R.id.cardNo);
        my = findViewById(R.id.my);
        sc = findViewById(R.id.sCode);
        saveCard = findViewById(R.id.saveCard);

        btnUpcoming = findViewById(R.id.btnUpcoming);
        btnUpcoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });


        bt = (Button) findViewById(R.id.btnBuy);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Payment successful",Toast.LENGTH_LONG).show();
            }
        });


    }

    public void openActivity8(){


        Intent intent = new Intent(this,EighthActivity.class);
        startActivity(intent);
    }
}
