package com.example.nowshowing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainBookActivity extends AppCompatActivity {

    Button book1,book2,book3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_book);
        book1 = findViewById(R.id.btnBookLion);
        book2 = findViewById(R.id.btnBookAladin);
        book3 = findViewById(R.id.btnBookSpider);



    }


    public void onClick(View v){
        Intent intent = new Intent(MainBookActivity.this,HowManyTickets.class);
        startActivity(intent);
    }

    public void bookAladin(View view){
        Intent intent1 = new Intent(MainBookActivity.this,HowManyTickets.class);
        startActivity(intent1);
    }
    public void bookLion(View view){
        Intent intent2 = new Intent(MainBookActivity.this,HowManyTickets.class);
        startActivity(intent2);
    }
    public void bookSpider(View view){
        Intent intent3 = new Intent(MainBookActivity.this,HowManyTickets.class);
        startActivity(intent3);
    }

}
