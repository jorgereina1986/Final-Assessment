package nyc.c4q;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.renderscript.Type;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by c4q-jorgereina on 8/30/15.
 */
public class MySQLiteOpenHelper extends OrmLiteSqliteOpenHelper
{
    public static final String MYDB = "mydb";
    public static final int VERSION = 1;

    private static MySQLiteOpenHelper INSTANCE;

    public MySQLiteOpenHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, databaseName, factory, databaseVersion);
    }


    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    public static Collection<OrmLiteSqliteOpenHelper> fromJson(String json) {
        Collection<OrmLiteSqliteOpenHelper> items = new ArrayList<>();
        Type type = new TypeToken<Collection<MySQLiteOpenHelper>>() {}.getType();
        try {
            items = new Gson().fromJson(json, type);
        }
        catch (Exception ex) {
            Log.e(LOG_TAG, Log.getStackTraceString(ex));
        }
        return items;
    }


}