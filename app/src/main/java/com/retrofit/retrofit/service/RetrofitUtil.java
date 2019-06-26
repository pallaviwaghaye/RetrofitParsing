package com.retrofit.retrofit.service;

import com.retrofit.retrofit.ApiConstants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Akruti on 19-02-2018.
 */

public class RetrofitUtil {
    public static final String BASE_URL= ApiConstants.BASE_URL;
    public static final long READ_TIMEOUT=1;
    public static final long CONNECT_TIMEOUT=1;

    public OkHttpClient getClient(String BASE_URL)
    {
        HttpLoggingInterceptor logging=new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        //add interceptor to OkHttpClient
        OkHttpClient.Builder builder=new OkHttpClient.Builder();
        builder.interceptors().add(logging);
        builder.readTimeout(READ_TIMEOUT, TimeUnit.MINUTES);
        builder.connectTimeout(CONNECT_TIMEOUT,TimeUnit.MINUTES);
        return builder.build();

    }
    //get retrofit object
    public Retrofit getRetrofitBuilder(String BASE_URL)
    {
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient(BASE_URL))
                .build();
    }

}
