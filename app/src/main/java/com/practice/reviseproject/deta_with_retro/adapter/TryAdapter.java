package com.practice.reviseproject.deta_with_retro.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.practice.reviseproject.R;
import com.practice.reviseproject.deta_with_retro.model.TryModel;

import java.util.ArrayList;

public class TryAdapter  extends RecyclerView.Adapter<TryAdapter.MyViewHolderr> {
    private Context context;
    private ArrayList<TryModel.Item> arrayList;

    public TryAdapter(Context context, ArrayList<TryModel.Item> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolderr onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_retro, viewGroup, false);

        return new MyViewHolderr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderr myViewHolderr, final int i) {
        myViewHolderr.tv_title.setText("Title:"+ arrayList.get(i).getTitle());
        myViewHolderr.tv_item_title.setText("pulbilsed:"+arrayList.get(i).getPublished());
        myViewHolderr.tv_item_authour.setText("descr:"+arrayList.get(i).getDescription());
        myViewHolderr.tv_item_title.setText("Tags:"+arrayList.get(i).getTags());

        myViewHolderr.mview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, arrayList.get(i).getDescription(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public  static  class  MyViewHolderr extends RecyclerView.ViewHolder{

        private TextView tv_item_title, tv_item_authour, tv_title, tv_item_published;
        View mview;

        public MyViewHolderr(@NonNull View itemView) {
            super(itemView);
            mview=itemView;

            tv_title=mview.findViewById(R.id.id);
            tv_item_title=mview.findViewById(R.id.user_id);
            tv_item_authour=mview.findViewById(R.id.title_re);
            tv_item_published=mview.findViewById(R.id.body);        }
    }
}
