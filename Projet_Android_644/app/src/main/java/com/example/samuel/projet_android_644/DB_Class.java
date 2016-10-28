package com.example.samuel.projet_android_644;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DB_Class extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String TEXT_TYPE ="VARCHAR";

    public static final String DATABASE_NAME = "WorkTimeDB.db";
    public static final String SQL_CREATES_ENTRIES = "CREATE TABLE " + DB_Contract.workers.TABLE_NAMES +
            "(" + DB_Contract.workers.COLUMN_NAME_WORKER_ID + "INTEGER PRIMARY KEY," +
            DB_Contract.workers.COLUMN_NAME_FIRSTNAME + "VARCHAR," + DB_Contract.workers.COLUMN_NAME_NAME + "VARCHAR," +
            DB_Contract.workers.COLUMN_NAME_BIRTHDATE + "DATE, " + DB_Contract.workers.COLUMN_NAME_SEXE + "VARCHAR);";

    public DB_Class(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS", "Table created/opened");
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL((SQL_CREATES_ENTRIES));
        Log.e("DATABASE OPERATIONS", "Table created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
