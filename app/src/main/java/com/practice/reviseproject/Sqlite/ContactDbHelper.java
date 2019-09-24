package com.practice.reviseproject.Sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;

public class ContactDbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "contact_db";
    public static final int DATABASE_VERSION = 1;

    public static final String CREATE_TABLE = "create table " + ContactContract.ContactEntry.TABLE_NAME +
            "(" + ContactContract.ContactEntry.CONTACT_ID + " number," + ContactContract.ContactEntry.NAME + " text," +
            ContactContract.ContactEntry.EMAIL + " text);";

    public static final String DROP_TABLE = " drop table if exists " + ContactContract.ContactEntry.TABLE_NAME;

    public ContactDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("the sqlite database is created","Database created");
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

    public  void addContact(int id, String name, String email, SQLiteDatabase sqLiteDatabase){
        ContentValues contentValues= new ContentValues();
        contentValues.put(ContactContract.ContactEntry.CONTACT_ID, id);
        contentValues.put(ContactContract.ContactEntry.NAME,name);
        contentValues.put(ContactContract.ContactEntry.EMAIL, email);
        sqLiteDatabase.insert(ContactContract.ContactEntry.TABLE_NAME,null, contentValues);

        Log.d("Crated", "One Row is inserted");

    }
}
