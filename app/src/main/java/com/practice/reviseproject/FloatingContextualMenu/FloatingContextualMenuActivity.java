package com.practice.reviseproject.FloatingContextualMenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.practice.reviseproject.R;

import java.util.ArrayList;

public class FloatingContextualMenuActivity extends AppCompatActivity {
    private ListView listView;
    private String[] list_resources;
    ArrayList<String > arrayList= new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_contextual_menu);
        listView=findViewById(R.id.floating_contextual_menu_listview);
        list_resources= getResources().getStringArray(R.array.Contry_names);

        for (String items:list_resources){
            arrayList.add(items);
        }
        arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);


    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();

        switch (item.getItemId()){
            case R.id.delete:
                arrayList.remove(info.position);
                arrayAdapter.notifyDataSetChanged();
                return true;
                default:
                    return super.onContextItemSelected(item);
        }
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.floaqting_contextual_menu, menu);
    }
}
