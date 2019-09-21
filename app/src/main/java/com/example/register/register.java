package com.example.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    DatabaseHelper movieDb;

    public static final String FirstName = "firstName";
    public static final String LastName = "lastName";
    public static final String Email = "Email";
    public static final String Telephone = "telephone";
    public static final String UserName = "UserName";
    public static final String Password = "Password";
    public static final String ConfirmPassword = "ConfirmPassword";

    private EditText fname, lname, email, tel,userName, password, confirmPass;
    private Button Register, Cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        movieDb = new DatabaseHelper(this);

        fname = findViewById(R.id.txtfirstName);
        lname = findViewById(R.id.txtlName);
        email = findViewById(R.id.txtEmail);
        tel = findViewById(R.id.txtTel1);
        userName = findViewById(R.id.txtuserName);
        password = findViewById(R.id.txtPassword);
        confirmPass = findViewById(R.id.txtConfirmPassword);

        Register = findViewById(R.id.btnRegister);
        Cancel = findViewById(R.id.btnCancel);

        //addData();

    }

    public void register(View v) {

            String fnme = fname.getText().toString();
            String lnme = lname.getText().toString();
            String eml = email.getText().toString();
            String telphne = tel.getText().toString();
            String UserNme = userName.getText().toString();
            String pass = password.getText().toString();
            String ConfirmPassword = confirmPass.getText().toString();


        if (UserNme.equals("") || fnme.equals("") || lnme.equals("") || eml.equals("") || telphne.equals("") || pass.equals("")){
            Toast.makeText(getApplicationContext(),"Fields are empty", Toast.LENGTH_SHORT).show();
        }else {
            if (pass.equals(ConfirmPassword)) {
                Boolean chkUsername = movieDb.chkUsername(UserNme);

                if(chkUsername == true){
                    Boolean insert = movieDb.insertData(fnme, lnme, eml, Integer.parseInt(telphne), UserNme, pass);
                    if (insert == true){
                        Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Username already exists", Toast.LENGTH_LONG).show();
                    }
                    }
                }
            else {
                Toast.makeText(getApplicationContext(), "Password do not match", Toast.LENGTH_LONG).show();
            }
        }
                Intent intent = new Intent(this, UserProfile.class);


                intent.putExtra(FirstName, fnme);
                intent.putExtra(LastName, lnme);
                intent.putExtra(Email, eml);
                intent.putExtra(Telephone, telphne);
                intent.putExtra(UserName, UserNme);
                intent.putExtra(Password, pass);

                startActivity(intent);
        }

   public void login(View view){
       Intent intent = new Intent(this,Login.class);
       startActivity(intent);
    }


}
