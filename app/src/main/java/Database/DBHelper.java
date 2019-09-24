package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

import com.example.nowshowing.HowManyTickets;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
   // public static final String DATABASE_NAME = "Movie.db";


    public DBHelper(HowManyTickets howManyTickets, String s, Context context, int i) {
        super(context, "Movie.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE MOVIETICKETS(ID INTEGER PRIMARY KEY AUTOINCREMENT, NOOFFULLTICKETS TEXT UNIQUE,NOOFHALFTICKETS TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS MOVIETICKETS;");
        onCreate(db);
    }
    public void insert_movietickets(String nooffulltickets,String noohalftickets){
        ContentValues contentValues = new ContentValues();
        contentValues.put("NOOFFULLTICKETS",nooffulltickets);
        contentValues.put("NOOFHALFTICKETS",noohalftickets);
        this.getWritableDatabase().insertOrThrow("MOVIETICKETS","",contentValues);

    }
    public void delete_movietickets(String nooffulltickets){
        this.getWritableDatabase().delete("MOVIETICKETS","NOOFFULLTICKETS='" + nooffulltickets + "'",null);

    }
    public void uodate_movietickets(String old_nooffulltickets,String new_nooffulltickets){
        this.getWritableDatabase().execSQL("UPDATE MOVIETICKETS SET NOOFFULLTICKETS='" + new_nooffulltickets + "'WHERE NOOFFULLTICKETS ='" + old_nooffulltickets+"'");
    }
    public void list_all_movietickets(TextView textView){
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM MOVIETICKETS",null);
        textView.setText("");
        while (cursor.moveToNext()){
            textView.append(cursor.getString(1)+""+cursor.getString(2));
        }
    }

}



