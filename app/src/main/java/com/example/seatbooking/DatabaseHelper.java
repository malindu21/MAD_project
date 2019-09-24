package com.example.seatbooking;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="seatsB.db";
    public static final String TABLE_NAME ="seatBook";
    public static final String COL_1 ="seatNo";
    public static final String COL_2 ="seats";



    public DatabaseHelper(Context context) {
        super(context, "seatsB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table seatBook(seatNo int, seats text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS seatBook");
        //onCreate(db);

    }

    public boolean insertData(int seatN, String seats[])
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1,seatN);
        //cv.put(COL_2,seats);
        long result = db.insert(TABLE_NAME,null,cv);
        if (result == 1)
            return false;
        else
            return true;

    }

    public boolean updateData(int seatN, String seats[])
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1,seatN);
        //cv.put(COL_2,seats);
        db.update(TABLE_NAME,cv,"seatNo = ?",new String[]{String.valueOf(seatN)});
        return true;

    }

    public Integer deleteData(int seatN)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,"seatNo = ?",new String[]{String.valueOf(seatN)});
    }

}