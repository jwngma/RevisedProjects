package com.practice.reviseproject.WelcomeIntroducer.Prabesh;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.practice.reviseproject.R;


public class WelcomeStartActivity extends AppCompatActivity {
    private ViewPager mviewPager;
    private int[] layouts={R.layout.item_one_for_prabesh_viewpager,R.layout.item_two_for_prabesh_viewpager,R.layout.item_three_for_prabesh_viewpager,R.layout.item_four_for_prabesh_viewpager};
   private ViewPagerAdapter madapter;
   private LinearLayout dots_layout;
   private ImageView[] dots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_start);

        if (Build.VERSION.SDK_INT>23){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        mviewPager=findViewById(R.id.prabesh_viewpager);
        madapter=new ViewPagerAdapter(this, layouts);
        mviewPager.setAdapter(madapter);

        dots_layout=findViewById(R.id.dotss_layout);
        createDots(0);



    }

    private void createDots(int current_position) {
        if (dots_layout!=null){
            dots_layout.removeAllViews();

            dots= new ImageView[layouts.length];

            for (int i=0;i<layouts.length;i++){
                dots[i]= new ImageView(this);
            }

            


        }
    }
}
