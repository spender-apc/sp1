package novozhilova.nastest;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DatabaseHandler extends SQLiteOpenHelper  {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "costManager.db";
    private static final String TABLE_COSTS = "costs";
    private static final String KEY_RANK = "rank";
    private static final String KEY_SUB_RANK = "subrank";
    private static final String KEY_AMOUNT = "amount";
    private static final String KEY_DATE = "date";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_COSTS = "CREATE TABLE " + TABLE_COSTS + "("
                + KEY_RANK + " TEXT PRIMARY KEY," + KEY_SUB_RANK + "TEXT FOREIGN KEY" + KEY_AMOUNT + " TEXT,"
                + KEY_DATE + " TEXT" + ")";
        db.execSQL(CREATE_TABLE_COSTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

// Запишем в журнал
        Log.w("SQLite", "Обновляемся с версии " + oldVersion + " на версию " + newVersion);

        // Удаляем старую таблицу и создаём новую
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COSTS);
        // Создаём новую таблицу
        onCreate(db);
    }

}
