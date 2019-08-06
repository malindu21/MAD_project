package com.example.mad_finale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SeventhActivity extends AppCompatActivity {

    Button bookticket;
    Button seat1,seat2,seat3,seat4,seat5,seat6,seat7,seat8,seat9,seat10,seat11,seat12,seat13,seat14,seat15,seat16,seat17,seat18,seat19,seat20,seat21,seat22,seat23,seat24,seat25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        seat1 = findViewById(R.id.seat1);
        seat2 = findViewById(R.id.seat2);
        seat3 = findViewById(R.id.seat3);
        seat4 = findViewById(R.id.seat4);
        seat5 = findViewById(R.id.seat5);
        seat6 = findViewById(R.id.seat6);
        seat7 = findViewById(R.id.seat7);
        seat8 = findViewById(R.id.seat8);
        seat9 = findViewById(R.id.seat9);
        seat10= findViewById(R.id.seat10);
        seat11 = findViewById(R.id.seat11);
        seat12 = findViewById(R.id.seat12);
        seat13 = findViewById(R.id.seat13);
        seat14 = findViewById(R.id.seat14);
        seat15 = findViewById(R.id.seat15);
        seat16 = findViewById(R.id.seat16);
        seat17 = findViewById(R.id.seat17);
        seat18 = findViewById(R.id.seat18);
        seat19 = findViewById(R.id.seat19);
        seat20= findViewById(R.id.seat20);
        seat21 = findViewById(R.id.seat21);
        seat22 = findViewById(R.id.seat22);
        seat23 = findViewById(R.id.seat23);
        seat24 = findViewById(R.id.seat24);
        seat25 = findViewById(R.id.seat25);

        seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 1 selected",Toast.LENGTH_LONG).show();
            }
        });

        seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 2 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 3 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 4 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 5 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 6 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 7 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 8 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 9 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 10 selected",Toast.LENGTH_LONG).show();
            }
        });

        seat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 11 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 12 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 13 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 14 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 15 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 16 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 17 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 18 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 19 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 20 selected",Toast.LENGTH_LONG).show();
            }
        });

        seat21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 21 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 22 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 23 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 24 selected",Toast.LENGTH_LONG).show();
            }
        });
        seat25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seat number 25 selected",Toast.LENGTH_LONG).show();
            }
        });


        bookticket = findViewById(R.id.bookticket);
        bookticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity11();
            }
        });


    }

    public void openActivity11(){

        Intent intent = new Intent(this,EleventhActivity.class);
        startActivity(intent);

    }
}
