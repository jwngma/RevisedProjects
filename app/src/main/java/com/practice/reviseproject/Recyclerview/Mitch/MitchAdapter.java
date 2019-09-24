package com.practice.reviseproject.Recyclerview.Mitch;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.practice.reviseproject.R;

import java.util.List;

public class MitchAdapter  extends  RecyclerView.Adapter<MitchAdapter.MyViewHolder> {
    private List<MitchModel> mitchModelList;
    private LayoutInflater layoutInflater;

    public MitchAdapter(MitchRecyclerviewActivity mitchRecyclerviewActivity, List<MitchModel> objectlist) {
    }

    public MitchAdapter(List<MitchModel> mitchModelList, LayoutInflater layoutInflater) {
        this.mitchModelList = mitchModelList;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= layoutInflater.inflate(R.layout.item_layout_for_mitchrecy,viewGroup, false);
        MyViewHolder myViewHolder= new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        MitchModel current=mitchModelList.get(i);
        myViewHolder.setData(current,i);
    }

    @Override
    public int getItemCount() {
        return mitchModelList.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView imgThumb,imgDelete,imgCopy;
        private int position;
        private MitchModel currentObject;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.recy_title);
            imgThumb=itemView.findViewById(R.id.recy_image);
            imgDelete=itemView.findViewById(R.id.recy_delete);
            imgCopy=itemView.findViewById(R.id.recy_copy);
        }

        public void setData(MitchModel current, int position) {
            this.title.setText(currentObject.getTitle());
            this.imgThumb.setImageResource(currentObject.getImages());
            this.position=position;
            this.currentObject=currentObject;
        }
    }
}
