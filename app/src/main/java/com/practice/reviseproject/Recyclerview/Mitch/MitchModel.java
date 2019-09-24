package com.practice.reviseproject.Recyclerview.Mitch;

import com.practice.reviseproject.R;

import java.util.ArrayList;
import java.util.List;

public class MitchModel {

    private String title;
    private int images;


    public MitchModel() {
    }

    public MitchModel(String title, int images) {
        this.title = title;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public static List<MitchModel> getObjectlist() {

        List<MitchModel> datalist = new ArrayList<>();
        int[] images = getimages();
        for (int i = 0; i < images.length; i++) {

            MitchModel mitchModel = new MitchModel();
            mitchModel.setImages(images[i]);
            mitchModel.setTitle("picture" + i);
            datalist.add(mitchModel);
        }
        return datalist;
    }

    private static int[] getimages() {
        int[] images = {R.drawable.collar, R.drawable.coffee,
                R.drawable.clock, R.drawable.car, R.drawable.cloud,
                R.drawable.contact, R.drawable.coin};

        return images;
    }
}
