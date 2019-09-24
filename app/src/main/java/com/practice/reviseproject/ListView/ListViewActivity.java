package com.practice.reviseproject.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private String[] list;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listview);
        list = getResources().getStringArray(R.array.Contry_names);

        //default android laypyut
        //arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        // custom style for the layoyt
        arrayAdapter = new ArrayAdapter<>(this, R.layout.item_layout_for_listview, R.id.listview_item, list);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setSelected(true);
                Toast.makeText(ListViewActivity.this, parent.getItemAtPosition(position) + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
