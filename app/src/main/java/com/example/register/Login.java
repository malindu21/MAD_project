package com.example.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    DatabaseHelper movieDb;
    private EditText userName,password;
    private Button Login;
    //private int counter = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        movieDb = new DatabaseHelper(this);

        userName = findViewById(R.id.txtuserName2);
        password = findViewById(R.id.txtpassword2);
        Login = findViewById(R.id.btnlogin);

       /* Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(userName.getText().toString(),password.getText().toString());
            }
        });*/


    }

    //validations
    //Intent to home page...
   /* private void validate(String userName,String userPassword){
        if((userName == "Admin" ) && (userPassword == "1234")){
            Intent intent = new Intent(Login.this,UserProfile.class);
            startActivity(intent);
        }else {
            counter--;

            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }*/

    public void register(View view){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

    public void Login(View view){
       // Intent intent = new Intent(this,register.class);
        //startActivity(intent);

        String username = userName.getText().toString();
        String pass = password.getText().toString();

        boolean chkUsernamePassword = movieDb.usernamePassword(username,pass);

        if (chkUsernamePassword == true){
            Intent intent = new Intent(this,home_page.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(),"Username or password is incorrect",Toast.LENGTH_LONG).show();
        }
    }
}
