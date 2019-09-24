package com.practice.reviseproject.deta_with_retro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.practice.reviseproject.R;

import com.practice.reviseproject.deta_with_retro.adapter.Adapter;
import com.practice.reviseproject.deta_with_retro.model.Model;
import com.practice.reviseproject.deta_with_retro.remote.ApiServices;
import com.practice.reviseproject.deta_with_retro.remote.RetroClass;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataRetriveActivity extends AppCompatActivity {


    private static final String TAG = "DataRetriveActivity";
    private ArrayList<Model> arrayList;
    private Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_retrive);
        Log.d(TAG, "onCreate: Activity is created");

        recyclerView = findViewById(R.id.recy_retrive);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getPost();


    }


    private void getPost() {

        Call<List<Model>> call = RetroClass.getApiServices().getPost();

        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                if (!response.isSuccessful()) {
                    Log.d(TAG, "onResponse: Response is not success" + response.errorBody());
                    return;
                }

                arrayList = new ArrayList<>(response.body());
                adapter= new Adapter(DataRetriveActivity.this, arrayList);
                recyclerView.setAdapter(adapter);


                Log.d(TAG, "onResponse: Result" + response.message());


                for (int i=0;i<arrayList.size();i++){
                    Log.d(TAG, "onResponse: second res"+arrayList.get(i).getTitle());

                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Log.d(TAG, "onFailure: err" + t.getMessage());

            }
        });

    }
}
