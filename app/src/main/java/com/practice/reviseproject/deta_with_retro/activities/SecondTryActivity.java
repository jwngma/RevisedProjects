package com.practice.reviseproject.deta_with_retro.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.practice.reviseproject.R;
import com.practice.reviseproject.deta_with_retro.adapter.TryAdapter;
import com.practice.reviseproject.deta_with_retro.model.TryModel;
import com.practice.reviseproject.deta_with_retro.remote.ApiServices;
import com.practice.reviseproject.deta_with_retro.remote.RetroClass;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondTryActivity extends AppCompatActivity {
    private static final String TAG = "SecondTryActivity";
    private TextView try_text;
    private ArrayList<TryModel.Item> arrayList;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_try);
        try_text=findViewById(R.id.try_text);


        recyclerView=findViewById(R.id.try_recyy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiServices apiServices= RetroClass.getApiServices();
        Call<TryModel> call=apiServices.getTryModel();
        call.enqueue(new Callback<TryModel>() {
            @Override
            public void onResponse(Call<TryModel> call, Response<TryModel> response) {
                if (!response.isSuccessful()){
                    Toast.makeText(SecondTryActivity.this, "Failed with error code"+ response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                TryModel tryModel= response.body();
                arrayList= new ArrayList<>(tryModel.getItems());
                adapter= new TryAdapter(SecondTryActivity.this, arrayList);
                recyclerView.setAdapter(adapter);

                //String ee= tryModel.getTitle();
                try_text.setText(arrayList.get(0).getTitle());
            }
            @Override
            public void onFailure(Call<TryModel> call, Throwable t) {
                Log.d(TAG, "onFailure: Error"+t.getMessage());

            }
        });
    }
}
