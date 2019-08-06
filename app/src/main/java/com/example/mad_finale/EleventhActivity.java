package com.example.mad_finale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EleventhActivity extends AppCompatActivity {

    Button hmtContinue,hmtDelete,hmtUpdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);

        hmtUpdate = findViewById(R.id.hmtUpdate);
        hmtDelete = findViewById(R.id.hmtDelete);

        hmtUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ticket Updated!",Toast.LENGTH_LONG).show();
            }
        });

        hmtDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ticket Deleted!",Toast.LENGTH_LONG).show();
            }
        });


        hmtContinue = findViewById(R.id.hmtContinue);
        hmtContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
    }


    public void openActivity4() {

        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}