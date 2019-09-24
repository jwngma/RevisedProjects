package com.practice.reviseproject.Viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practice.reviseproject.R;


public class PagerFragment extends Fragment {
    private TextView pagerText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);


        pagerText = view.findViewById(R.id.pegerText);
        Bundle bundle = getArguments();
        String message = Integer.toString(bundle.getInt("count"));
        pagerText.setText(message);


        return view;
    }

}
