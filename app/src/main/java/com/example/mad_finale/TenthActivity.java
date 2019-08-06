package com.example.mad_finale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TenthActivity extends AppCompatActivity {

    Button signUpReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);


        signUpReg = findViewById(R.id.signUpReg);

        signUpReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Congratulations! you have successfully signed up",Toast.LENGTH_LONG).show();
            }
        });
    }
}
