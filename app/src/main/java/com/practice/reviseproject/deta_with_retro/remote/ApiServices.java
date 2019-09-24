package com.practice.reviseproject.deta_with_retro.remote;

import com.practice.reviseproject.deta_with_retro.model.Model;
import com.practice.reviseproject.deta_with_retro.model.TryModel;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("posts")
    Call<List<Model>> getPost();


    @GET("photos_public.gne?tagmode=all&format=json&nojsoncallback=1&tags=android")
    Call<TryModel> getTryModel();

}
