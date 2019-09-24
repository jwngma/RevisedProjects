package com.practice.reviseproject.Recyclerview.Recyclerview_try1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practice.reviseproject.R;

import java.util.List;

public class try_Adapter extends RecyclerView.Adapter<try_Adapter.MyViewHolder> {
    private Context context;
    private List<Model> list;

    public try_Adapter(Context context, List<Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout_for_recy_try, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Model model = list.get(i);
        myViewHolder.title.setText(model.getTitle());
        myViewHolder.genre.setText(model.getGenre());
        myViewHolder.year.setText(model.getYear());

        myViewHolder.mview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        View mview;

        private TextView title, genre, year;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mview = itemView;
            title = mview.findViewById(R.id.try_title);
            genre = mview.findViewById(R.id.try_genre);
            year = mview.findViewById(R.id.try_year);
        }
    }
}
