package com.practice.reviseproject.BroadCastReceivers.prabeesh.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practice.reviseproject.BroadCastReceivers.prabeesh.model.IncomingNumber;
import com.practice.reviseproject.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class IncomingCallAdapter extends RecyclerView.Adapter<IncomingCallAdapter.myViewHolderrrr> {
    private ArrayList<IncomingNumber> numberArrayList;
    private Context context;

    public IncomingCallAdapter(ArrayList<IncomingNumber> numberArrayList, Context context) {
        this.numberArrayList = numberArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolderrrr onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout_for_incoming_call, viewGroup, false);
        return new myViewHolderrrr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderrrr myViewHolderrrr, int i) {
        myViewHolderrrr.tv_id.setText(numberArrayList.get(i).getId().toString());
        myViewHolderrrr.tv_number.setText(numberArrayList.get(i).getNumber().toString());
    }

    @Override
    public int getItemCount() {
        return numberArrayList.size();
    }

    public static class myViewHolderrrr extends RecyclerView.ViewHolder {
        private View mview;
        private TextView tv_id, tv_number;

        public myViewHolderrrr(@NonNull View itemView) {
            super(itemView);
            mview = itemView;
            tv_id = mview.findViewById(R.id.call_id);
            tv_number = mview.findViewById(R.id.call_number);

        }
    }
}
