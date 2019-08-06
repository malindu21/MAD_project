package com.example.mad_finale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    Button showNow,btnUserProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnUserProfile = findViewById(R.id.btnUserProfile);
        btnUserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity9();
            }
        });

        showNow = findViewById(R.id.btnShowingNow);
        showNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity6();
            }
        });
    }
    public void openActivity6(){

        Intent intent = new Intent(this,SixthActivity.class);
        startActivity(intent);
    }

    public void openActivity9(){

        Intent intent = new Intent(this,NinethActivity.class);
        startActivity(intent);
    }
}
