package com.example.mad_finale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnsSingup,btnsLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnsSingup = findViewById(R.id.btnSingup);
        btnsLogin = findViewById(R.id.btnLogin);

        btnsLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity5();
            }
        });

        btnsSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });


    }

    public void openActivity5(){

        Intent intent = new Intent(this,FifthActivity.class);
        startActivity(intent);
    }

    public void openActivity10(){

        Intent intent = new Intent(this,TenthActivity.class);
        startActivity(intent);
    }
}
