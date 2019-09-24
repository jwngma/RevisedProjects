package com.practice.reviseproject.WelcomeIntroducer.WelcomeIntro;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.practice.reviseproject.R;

public class WelcomeIntroducerActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private SliderAdapter adapter;
    private Button skipBtn, nextBtn;

    private LinearLayout dots_layout;
    private ImageView[] dots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_introducer);
        viewPager = findViewById(R.id.welcome_viewPager);
        dots_layout=findViewById(R.id.dots_layout);
        adapter = new SliderAdapter(this);
        skipBtn = findViewById(R.id.skipBtn);
        nextBtn = findViewById(R.id.nextBtn);

        if (new PreferenceManager(this).checkPreference()){
            loadHome();
        }

        skipBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);

        viewPager.setAdapter(adapter);

        createDots(0);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(final int i) {
                createDots(i);
                if (i==dots.length-1){
                    nextBtn.setText("Start");
                    skipBtn.setVisibility(View.INVISIBLE);
                }
                else {
                    nextBtn.setText("Next");
                    skipBtn.setText("Skip");
                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }

    private void createDots(int currentPosition) {
        if (dots_layout != null) {
            dots_layout.removeAllViews();

            dots = new ImageView[13];
            for (int i = 0; i < 13; i++) {
                dots[i] = new ImageView(this);
                if (i == currentPosition) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dot));
                } else {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.default_dot));

                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                dots_layout.addView(dots[i], layoutParams);

            }

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.skipBtn:
                loadHome();
                new PreferenceManager(this).WritePreference();

                break;
            case R.id.nextBtn:
                nextSlide();
                break;
        }

    }

    private void nextSlide() {
        int nextSlide = viewPager.getCurrentItem() + 1;
        if (nextSlide < 13) {
            viewPager.setCurrentItem(nextSlide);
        }


        // if o want to return to the first slide from the last slide
        /*else if (nextSlide > viewPager.getChildCount()) {
            viewPager.setCurrentItem(0);
        }*/

        // will start the home fro the last slide
        else
        {
            loadHome();
            new PreferenceManager(this).WritePreference();

        }
    }

    private void loadHome() {
        startActivity(new Intent(WelcomeIntroducerActivity.this, LoadHomeActivity.class));
    }
}
