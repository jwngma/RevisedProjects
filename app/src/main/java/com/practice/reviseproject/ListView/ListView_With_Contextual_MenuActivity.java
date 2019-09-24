package com.practice.reviseproject.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.practice.reviseproject.R;

import java.util.ArrayList;
import java.util.List;

public class ListView_With_Contextual_MenuActivity extends AppCompatActivity {

    private ListView listView;
    private String[] list;
    private ArrayList arrayList= new ArrayList();
    private ArrayAdapter<String> arrayAdapter;

    private List selected_list= new ArrayList();

    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view__with__contextual__menu);
        listView = findViewById(R.id.listview_with_contextual_menu);
        list = getResources().getStringArray(R.array.Contry_names);

        //default android laypyut
        //arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        // custom style for the layoyt
        for (String items:list){
            arrayList.add(items);
        }
        arrayAdapter = new ArrayAdapter<>(this, R.layout.item_layout_for_listview, R.id.listview_item, arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {

                if (checked){
                    selected_list.add(listView.getItemAtPosition(position));
                    Toast.makeText(ListView_With_Contextual_MenuActivity.this, listView.getItemAtPosition(position)+"is Selected", Toast.LENGTH_SHORT).show();
                    count++;
                    mode.setTitle(count+"");

                }
                else {
                    selected_list.remove(listView.getItemAtPosition(position));
                    Toast.makeText(ListView_With_Contextual_MenuActivity.this, listView.getItemAtPosition(position)+"is UnSelected", Toast.LENGTH_SHORT).show();

                    count--;
                    mode.setTitle(count+"");


                }

            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                getMenuInflater().inflate(R.menu.floaqting_contextual_menu, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                mode.setTitle(count+"");
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()){
                    case R.id.delete:
                        for (Object items:selected_list){
                            String ITEMS=items.toString();
                            arrayList.remove(ITEMS);

                        }
                        arrayAdapter.notifyDataSetChanged();
                        mode.finish();
                }
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                count=0;
                mode=null;
                selected_list.clear();

            }
        });
    }
}
