package com.practice.reviseproject.deta_with_retro.remote;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {
    private static final String BASEURL = "https://jsonplaceholder.typicode.com/";
    private  static  final String SECONDBASE="https://api.flickr.com/services/feeds/photos_public.gne/services/feeds/";


    public static Retrofit getmInstance() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.addInterceptor(httpLoggingInterceptor);

        return new Retrofit.Builder()
                .baseUrl(SECONDBASE)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient.build())
                .build();

    }

    public static  ApiServices getApiServices() {
        return getmInstance().create(ApiServices.class);
    }

}
