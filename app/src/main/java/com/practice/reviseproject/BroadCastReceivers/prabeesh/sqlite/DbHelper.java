package com.practice.reviseproject.BroadCastReceivers.prabeesh.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "numberDb";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE = "create Table " + DbContract.TABLE_NAME +
            "( id integer primary key autoincrement," + DbContract.INCOMING_NUMBER + " text);";


    private static final String DROP_TABLE = "drop table if exists " + DbContract.TABLE_NAME;


    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        db.execSQL(CREATE_TABLE);

    }

    public void saveNumber(String number, SQLiteDatabase sqLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DbContract.INCOMING_NUMBER, number);
        sqLiteDatabase.insert(DbContract.TABLE_NAME, null, contentValues);

    }


    public Cursor readNumbers(SQLiteDatabase sqLiteDatabase) {
        String[] projection = {"id", DbContract.INCOMING_NUMBER};
        return (sqLiteDatabase.query(DbContract.TABLE_NAME, projection, null, null, null, null, null));

    }
}
