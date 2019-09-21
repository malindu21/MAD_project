package com.example.register;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "movie.db";
    public static final String TABLE_NAME = "user";
    public static final String COL_1 = "firstName";
    public static final String COL_2 = "lastName";
    public static final String COL_3 = "email";
    public static final String COL_4 = "tel";
    public static final String COL_5 = "userName";
    public static final String COL_6 = "password";
    //public static final String COL_8 = "CONFIRM_PASSWORD";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        //find out database created or not
        //SQLiteDatabase db = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(firstName text, lastName text, email text, tel integer, userName text primary key, password text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS user");
    }
    public boolean insertData(String fname, String lname, String email, int tel, String username, String pwd)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1, fname);
        cv.put(COL_2, lname);
        cv.put(COL_3, email);
        cv.put(COL_4, tel);
        cv.put(COL_5, username);
        cv.put(COL_6, pwd);
       // cv.put(COL_8, conpwd);

        long result = db.insert(TABLE_NAME,null,cv);
            if (result == 1)
                return false;
            else
                return true;
    }

   /* public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cu = db.rawQuery("SELECT * FROM user",null);
        return cu;
    }*/

    public boolean updateData(String fname, String lname, String email, int tel, String username){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1, fname);
        cv.put(COL_2, lname);
        cv.put(COL_3, email);
        cv.put(COL_4, tel);
        cv.put(COL_5, username);
        //cv.put(COL_7, pwd);
        //cv.put(COL_8, conpwd);

        db.update(TABLE_NAME,cv,"userName = ?",new String[]{username});
        return true;
    }

    public Integer deleteData(String username){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,"userName = ?",new String[] {username});
    }

    //checking unique username
    public Boolean chkUsername(String username){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where userName=?", new String[]{username});

        if (cursor.getCount() > 0){
            return false;
        }else {
            return true;
        }
    }

    //checking username and password for login
    public Boolean usernamePassword(String username, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where userName=? and password=?", new String[]{username, password});

        if (cursor.getCount() > 0){
            return true;
        }else{
            return false;
        }
    }
}