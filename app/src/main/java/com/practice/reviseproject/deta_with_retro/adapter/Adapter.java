package com.practice.reviseproject.deta_with_retro.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practice.reviseproject.R;
import com.practice.reviseproject.deta_with_retro.model.Model;

import java.util.ArrayList;
import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context context;
    private ArrayList<Model> arrayList;

    public Adapter(Context context, ArrayList<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_retro, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_uid.setText(arrayList.get(i).getUserId());
        myViewHolder.tv_id.setText(arrayList.get(i).getId());
        myViewHolder.tv_title.setText(arrayList.get(i).getTitle());
        myViewHolder.tv_body.setText(arrayList.get(i).getBody());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public  static  class  MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_uid, tv_id, tv_title, tv_body;
        View mview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;

            tv_id=mview.findViewById(R.id.id);
            tv_uid=mview.findViewById(R.id.user_id);
            tv_title=mview.findViewById(R.id.title_re);
            tv_body=mview.findViewById(R.id.body);        }
    }
}
