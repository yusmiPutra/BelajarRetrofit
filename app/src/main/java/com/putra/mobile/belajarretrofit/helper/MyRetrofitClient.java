package com.putra.mobile.belajarretrofit.helper;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Blackswan on 9/12/2017.
 */

public class MyRetrofitClient {
    public static Retrofit getRetrofit(){
        Retrofit r = new Retrofit.Builder()
                .baseUrl(MyConstant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  r;
    }

    public static RestApi getInstanceRetrofit(){
        return getRetrofit().create(RestApi.class);
    }
}
