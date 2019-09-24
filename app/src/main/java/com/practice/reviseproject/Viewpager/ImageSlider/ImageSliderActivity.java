package com.practice.reviseproject.Viewpager.ImageSlider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.practice.reviseproject.R;

public class ImageSliderActivity extends AppCompatActivity {
    private static final String TAG = "ImageSliderActivity";
    private ViewPager viewPager;
    private ImageSliderAdapter imageSliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);

        Log.d(TAG, "onCreate: Came to this Place");
        viewPager=findViewById(R.id.imageslider);
        imageSliderAdapter=new ImageSliderAdapter(this);
        viewPager.setAdapter(imageSliderAdapter);
    }
}
