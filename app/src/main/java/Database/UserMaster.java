package Database;

import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public final class UserMaster {
    private UserMaster(){}

    protected static class Users implements BaseColumns{
        public static final String TABLE_NAME = "user";
        public static final String COLUMN_NAME_NOOFFULLTICKETS = "nofullt";
        public static final String COLUMN_NAME_NOOFHALFTICKETS = "nohalft";


    }

}
