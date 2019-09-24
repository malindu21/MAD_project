package com.example.nowshowing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import Database.DBHelper;


import static com.example.nowshowing.R.id.noft;
import static com.example.nowshowing.R.id.noht;


public class HowManyTickets extends AppCompatActivity {
    EditText nooffulltickets,noofhalftickets;
    TextView textView;
    DBHelper helper;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_many_tickets);

        nooffulltickets = (EditText)findViewById(noft);
        noofhalftickets = (EditText)findViewById(noht);

        helper = new DBHelper(this,"",null,1);
    }

    public void btn_click(View view){
        switch (view.getId()){
            case R.id.btnContinue:

                try{
                    helper.insert_movietickets(nooffulltickets.getText().toString(),noofhalftickets.getText().toString());

                }catch (SQLiteException e){
                    Toast.makeText(HowManyTickets.this,"ALREADY EXISTS",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnDelete:
                helper.delete_movietickets(nooffulltickets.getText().toString());
                break;
            case R.id.btnUpdate:
                AlertDialog.Builder dialog = new AlertDialog.Builder(HowManyTickets.this);
                dialog.setTitle("Enter Number of full tickets");

                final EditText new_nooffulltickets = new EditText(this);
                dialog.setView(new_nooffulltickets);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        helper.uodate_movietickets(nooffulltickets.getText().toString(),new_nooffulltickets.getText().toString());
                    }
                });
                break;
          // case R.id.list_movietickets:
            //   helper.list_all_movietickets(textView);
              // break;
        }
    }
}
