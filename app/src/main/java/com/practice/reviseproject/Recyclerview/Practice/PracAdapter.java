package com.practice.reviseproject.Recyclerview.Practice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practice.reviseproject.R;

import java.util.List;

public class PracAdapter extends RecyclerView.Adapter<PracAdapter.MyViewHolder> {
    private Context context;
    private List<String> list;

    public PracAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout_for_recy_practice,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.one_text.setText(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder{

        View mView;
        private TextView one_text;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mView=itemView;
            one_text=mView.findViewById(R.id.one_text);

        }
    }
}
