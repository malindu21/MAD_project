package com.example.seatbooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;

public class Seat_main extends AppCompatActivity implements OnClickListener{

    Button btnCancel,btnConfirm;
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24 ;
    ArrayList<String> seatlist = new ArrayList<>();
    public static final String Seats = "seats";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_main);


        btnCancel=findViewById(R.id.btn_delete);
        btnConfirm =  findViewById(R.id.btn_confirm);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);




        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);

        btnCancel.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {



        switch (view.getId()){
            case R.id.btn1:
                if(!seatlist.contains("Seat1")){
                    btn1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat1");
                    Toast.makeText( Seat_main.this, "Seat number 1 selected", Toast.LENGTH_SHORT).show();
                }

                else if(seatlist.contains("Seat1")){
                    btn1.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat1");
                    Toast.makeText( Seat_main.this, "Seat number 1 removed", Toast.LENGTH_SHORT).show();
                }



                break;

            case R.id.btn2:
                if(!seatlist.contains("Seat2")) {
                    btn2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat2");
                    Toast.makeText(Seat_main.this, "Seat number 2 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat2")){
                    btn2.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat2");
                    Toast.makeText(Seat_main.this,"Seat number 2 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn3:
                if(!seatlist.contains("Seat3")) {
                    btn3.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat3");
                    Toast.makeText(Seat_main.this, "Seat number 3 selected", Toast.LENGTH_SHORT).show();

                }
                else if (seatlist.contains("Seat3")){
                    btn3.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat3");
                    Toast.makeText(Seat_main.this,"Seat number 3 removed",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn4:
                if(!seatlist.contains("Seat4")) {
                    btn4.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat4");
                    Toast.makeText(Seat_main.this, "Seat number 4 selected", Toast.LENGTH_SHORT).show();

                }
                else if (seatlist.contains("Seat4")){
                    btn4.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat4");
                    Toast.makeText(Seat_main.this,"Seat number 4 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn5:
                if(!seatlist.contains("Seat5")) {
                    btn5.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat5");
                    Toast.makeText(Seat_main.this, "Seat number 5 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat5")){
                    btn5.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat5");
                    Toast.makeText(Seat_main.this,"Seat number 5 removed",Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.btn6:
                if(!seatlist.contains("Seat6")) {
                    btn6.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat6");
                    Toast.makeText(Seat_main.this, "Seat number 6 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat6")){
                    btn6.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat6");
                    Toast.makeText(Seat_main.this,"Seat number 6 removed",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn7:
                if(!seatlist.contains("Seat7")) {
                    btn7.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat7");
                    Toast.makeText(Seat_main.this, "Seat number 7 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat7")){
                    btn7.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat7");
                    Toast.makeText(Seat_main.this,"Seat number 7 removed",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn8:
                if(!seatlist.contains("Seat8")) {
                    btn8.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat8");
                    Toast.makeText(Seat_main.this, "Seat number 8 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat8")){
                    btn8.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat8");
                    Toast.makeText(Seat_main.this,"Seat number 8 removed",Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.btn9:
                if(!seatlist.contains("Seat9")) {
                    btn9.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat9");
                    Toast.makeText(Seat_main.this, "Seat number 9 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat9")){
                    btn9.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat9");
                    Toast.makeText(Seat_main.this,"Seat number 9 removed",Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.btn10:
                if(!seatlist.contains("Seat10")) {
                    btn10.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat10");
                    Toast.makeText(Seat_main.this, "Seat number 10 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat10")){
                    btn10.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat10");
                    Toast.makeText(Seat_main.this,"Seat number 10 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn11:
                if(!seatlist.contains("Seat11")) {
                    btn11.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat11");
                    Toast.makeText(Seat_main.this, "Seat number 11 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat11")){
                    btn11.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat11");
                    Toast.makeText(Seat_main.this,"Seat number 11 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn12:
                if(!seatlist.contains("Seat12")) {
                    btn12.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat12");
                    Toast.makeText(Seat_main.this, "Seat number 12 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat12")){
                    btn12.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat12");
                    Toast.makeText(Seat_main.this,"Seat number 12 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn13:
                if(!seatlist.contains("Seat13")) {
                    btn13.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat13");
                    Toast.makeText(Seat_main.this, "Seat number 13 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat13")){
                    btn13.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat13");
                    Toast.makeText(Seat_main.this,"Seat number 13 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn14:
                if(!seatlist.contains("Seat14")) {

                    btn14.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat14");
                    Toast.makeText(Seat_main.this, "Seat number 14 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat14")){
                    btn14.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat14");
                    Toast.makeText(Seat_main.this,"Seat number 14 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn15:
                if(!seatlist.contains("Seat15")) {

                    btn15.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat15");
                    Toast.makeText(Seat_main.this, "Seat number 15 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat15")){
                    btn15.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat15");
                    Toast.makeText(Seat_main.this,"Seat number 15 removed",Toast.LENGTH_SHORT).show();
                }
                break;



            case R.id.btn16:
                if(!seatlist.contains("Seat16")) {
                    btn16.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat16");
                    Toast.makeText(Seat_main.this, "Seat number 16 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat16")){
                    btn16.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat16");
                    Toast.makeText(Seat_main.this,"Seat number 16 removed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn17:
                if(!seatlist.contains("Seat17")) {
                    btn17.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat17");
                    Toast.makeText(Seat_main.this, "Seat number 17 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat17")) {
                    btn17.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat17");
                    Toast.makeText(Seat_main.this, "Seat number 17 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn18:
                if(!seatlist.contains("Seat18")) {
                    btn18.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat18");
                    Toast.makeText(Seat_main.this, "Seat number 18 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat18")) {
                    btn18.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat18");
                    Toast.makeText(Seat_main.this, "Seat number 18 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn19:
                if(!seatlist.contains("Seat19")) {
                    btn19.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat19");
                    Toast.makeText(Seat_main.this, "Seat number 19 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat19")) {
                    btn19.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat19");
                    Toast.makeText(Seat_main.this, "Seat number 19 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn20:
                if(!seatlist.contains("Seat20")) {
                    btn20.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat20");
                    Toast.makeText(Seat_main.this, "Seat number 20 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat20")) {
                    btn20.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat20");
                    Toast.makeText(Seat_main.this, "Seat number 20 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn21:
                if(!seatlist.contains("Seat21")) {
                    btn21.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat21");
                    Toast.makeText(Seat_main.this, "Seat number 21 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat21")) {
                    btn21.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat21");
                    Toast.makeText(Seat_main.this, "Seat number 20 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn22:
                if(!seatlist.contains("Seat22")) {
                    btn22.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat22");
                    Toast.makeText(Seat_main.this, "Seat number 22 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat22")) {
                    btn22.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat22");
                    Toast.makeText(Seat_main.this, "Seat number 22 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn23:
                if(!seatlist.contains("Seat23")) {
                    btn23.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat23");
                    Toast.makeText(Seat_main.this, "Seat number 23 selected", Toast.LENGTH_SHORT).show();
                }else if (seatlist.contains("Seat23")) {
                    btn23.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat23");
                    Toast.makeText(Seat_main.this, "Seat number 23 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn24:
                if(!seatlist.contains("Seat24")) {
                    btn24.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    seatlist.add("Seat24");
                    Toast.makeText(Seat_main.this, "Seat number 24 selected", Toast.LENGTH_SHORT).show();
                }
                else if (seatlist.contains("Seat24")) {
                    btn24.setBackgroundColor(getResources().getColor(R.color.unselectedButtoncolor));
                    seatlist.remove("Seat24");
                    Toast.makeText(Seat_main.this, "Seat number 24 removed", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_delete:

                Toast.makeText(getApplicationContext(),"Deleted successfully", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(this, Seat_main.class);
                startActivity(intent);

                seatlist = null;

                break;
        }

    }

    public void confirm(View view){

        if(seatlist.isEmpty() == true) {
            Toast.makeText(getApplicationContext(),"No seat was selected", Toast.LENGTH_SHORT).show();
        }else{
            System.out.println(seatlist);

            Toast.makeText(getApplicationContext(),"Inserted successfully", Toast.LENGTH_SHORT).show();
        }
    }

    public void update(View view){

        if(seatlist.isEmpty() == true) {
            Toast.makeText(getApplicationContext(),"No seat was selected", Toast.LENGTH_SHORT).show();
        }else{
            System.out.println(seatlist);

            Toast.makeText(getApplicationContext(),"Updated successfully", Toast.LENGTH_SHORT).show();
        }
    }
}

