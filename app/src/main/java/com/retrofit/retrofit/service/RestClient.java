package com.retrofit.retrofit.service;



/**
 * Created by Akruti on 19-02-2018.
 */

public class RestClient {
    private static ApiService apiService;

    public static  ApiService getApiService(String BASEURL)
    {
        return new RetrofitUtil().getRetrofitBuilder(BASEURL).create(ApiService.class);
    }

}
