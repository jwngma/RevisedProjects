package com.practice.reviseproject.Sqlite;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.practice.reviseproject.MainActivity;
import com.practice.reviseproject.R;

public class SqliteActivity extends AppCompatActivity implements View.OnClickListener {
    private Button saveBtn, viewBtn, updateBtn, deleteBtn;
    private EditText edt_id, edt_name,edt_email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        saveBtn=findViewById(R.id.sq_save);
        viewBtn=findViewById(R.id.sq_show);
        updateBtn=findViewById(R.id.sq_update);
        deleteBtn=findViewById(R.id.sq_delete);

        saveBtn.setOnClickListener(this);
        viewBtn.setOnClickListener(this);
        updateBtn.setOnClickListener(this);
        deleteBtn.setOnClickListener(this);

        edt_email=findViewById(R.id.sq_email);
        edt_id=findViewById(R.id.sq_id);
        edt_name=findViewById(R.id.sq_name);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sq_save:
                Save();
                break;
            case R.id.sq_show:
                Show();
                break;
            case R.id.sq_update:
               Update();
                break;
            case R.id.sq_delete:
                Delete();
                break;
        }

    }

    private void Delete() {

    }

    private void Update() {
    }

    private void Show() {
    }

    private void Save() {

        String id=edt_id.getText().toString();
        String name=edt_name.getText().toString();
        String email=edt_email.getText().toString();

        ContactDbHelper contactDbHelper= new ContactDbHelper(this);
        SQLiteDatabase sqLiteDatabase= contactDbHelper.getWritableDatabase();
        contactDbHelper.addContact(Integer.parseInt(id),name,email,sqLiteDatabase);
        contactDbHelper.close();

        edt_id.setText("");
        edt_name.setText("");
        edt_email.setText("");
    }
}
