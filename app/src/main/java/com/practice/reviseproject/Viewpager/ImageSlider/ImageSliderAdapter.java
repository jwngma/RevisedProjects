package com.practice.reviseproject.Viewpager.ImageSlider;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.practice.reviseproject.R;

public class ImageSliderAdapter extends PagerAdapter {
    private int[] images = {R.drawable.add, R.drawable.car, R.drawable.clock, R.drawable.coffee, R.drawable.collar};

    private Context context;
    private LayoutInflater layoutInflater;


    public ImageSliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view ==(LinearLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_layout_for_imageslider, container, false);
        ImageView imageView = view.findViewById(R.id.slider_image);
        TextView textView = view.findViewById(R.id.slider_image_text);

        imageView.setImageResource(images[position]);
        textView.setText("Count " + position);
        container.addView(view);
        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
