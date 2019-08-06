package com.example.mad_finale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NinethActivity extends AppCompatActivity {

    Button userProUpdate,userProDlt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth);

        userProUpdate = findViewById(R.id.userProUpdate);
        userProDlt = findViewById(R.id.userProDlt);

        userProUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"User Updated!",Toast.LENGTH_LONG).show();
            }
        });

        userProDlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"User Deleted!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
