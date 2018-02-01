package com.putra.mobile.belajarretrofit.helper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by imastudio on 12/15/17.
 */

public class RetrofitClient {
    private static Retrofit retrofit =null;
    public static Retrofit getClient(String baseUrl){
        if (retrofit==null){

            retrofit= new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;


    }
}
