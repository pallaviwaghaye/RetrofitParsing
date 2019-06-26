package com.retrofit.retrofit.service;

import com.retrofit.retrofit.ApiConstants;
import com.retrofit.retrofit.BookTest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Akruti on 19-02-2018.
 */

public interface ApiService {
    @GET(ApiConstants.Book_URL)
    Call<List<BookTest>> getAllProducts();
}
