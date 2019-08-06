package com.example.mad_finale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity {

    Button book1,book2,book3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        book1 = findViewById(R.id.book1);
        book2 = findViewById(R.id.book2);
        book3 = findViewById(R.id.book3);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity7();
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity7();
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity7();
            }
        });
    }


    public void openActivity7(){

        Intent intent = new Intent(this,SeventhActivity.class);
        startActivity(intent);

    }
}
