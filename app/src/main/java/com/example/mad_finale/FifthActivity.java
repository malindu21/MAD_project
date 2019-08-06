package com.example.mad_finale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {

    private Button blogin,forgotBtn,reglogin;
    private EditText editUserName;
    private EditText editPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        editUserName = findViewById(R.id.loginEmail);
        editPassword = findViewById(R.id.loginPass);
        forgotBtn = findViewById(R.id.forgotBtn);
        reglogin = findViewById(R.id.reglogin);

        reglogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity10();

            }
        });

        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Sorry, We are Under Construction, This option will available soon, Thank you!",Toast.LENGTH_LONG).show();
            }
        });



        blogin = findViewById(R.id.login);
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    public void openActivity3(){

        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);

    }

    public void openActivity10(){
        Intent intent = new Intent(this,TenthActivity.class);
        startActivity(intent);


    }
}
