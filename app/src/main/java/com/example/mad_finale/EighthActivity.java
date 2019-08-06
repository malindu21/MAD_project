package com.example.mad_finale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EighthActivity extends AppCompatActivity {

    Button upcomingInsert,upcomingUpdate,upcomingDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        upcomingInsert = findViewById(R.id.upcomingInsert);
        upcomingUpdate = findViewById(R.id.upcomingUpdate);
        upcomingDelete = findViewById(R.id.upcomingDelete);


        upcomingInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Movie Inserted!",Toast.LENGTH_LONG).show();
            }
        });

        upcomingUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Movie Updated!",Toast.LENGTH_LONG).show();
            }
        });

        upcomingDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Movie Deleted!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
