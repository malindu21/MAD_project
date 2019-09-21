package com.example.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile extends AppCompatActivity {

    DatabaseHelper movieDb;
    private EditText fname,lname,username,email,tel;
    String fName,Lname,userName,mail,Tele;
    private Button update,delete, home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        movieDb = new DatabaseHelper(this);

        fname = findViewById(R.id.txtfname1);
        lname = findViewById(R.id.txtlname1);
        email = findViewById(R.id.txtemail1);
        tel = findViewById(R.id.txtTel1);
        username = findViewById(R.id.txtusername1);

        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
        home = findViewById(R.id.btnHome);

        Intent intent = getIntent();

        fName = intent.getStringExtra(register.FirstName);
        Lname = intent.getStringExtra(register.LastName);
        mail = intent.getStringExtra(register.Email);
        userName = intent.getStringExtra(register.UserName);
        Tele = intent.getStringExtra(register.Telephone);

        fname.setText(fName);
        lname.setText(Lname);
        email.setText(mail);
        tel.setText(Tele);
        username.setText(userName);

    }

    //connect to the home page

    public void main(View view){
        Intent intent = new Intent(this, home_page.class);
        startActivity(intent);
    }

    public void update(View view){
        Boolean isUpdated = movieDb.updateData(fname.getText().toString(), lname.getText().toString(), email.getText().toString(), Integer.parseInt(tel.getText().toString()), username.getText().toString());

        if (isUpdated == true){
            Toast.makeText(getApplicationContext(),"Updated successfully",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"Error in updating",Toast.LENGTH_SHORT).show();
        }
    }

    public void delete(View view){
        Integer deletedRows = movieDb.deleteData(username.getText().toString());

        if (deletedRows != 0){
            Toast.makeText(getApplicationContext(),"Deleted successfully",Toast.LENGTH_SHORT).show();

            fname.setText("");
            lname.setText("");
            email.setText("");
            tel.setText("");
            username.setText("");

            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"Error in deleting", Toast.LENGTH_SHORT).show();
        }
    }

}
