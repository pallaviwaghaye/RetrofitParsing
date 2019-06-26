package com.retrofit.retrofit;

import android.app.ProgressDialog;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.retrofit.retrofit.service.RestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);

        progressDialog=new ProgressDialog(ApiActivity.this);
        progressDialog.setMessage("Please Wait");
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();
        Call<List<BookTest>> BookCall= RestClient.getApiService(ApiConstants.BASE_URL).getAllProducts();

        BookCall.enqueue(new Callback<List<BookTest>>()
        {

            @Override
            public void onResponse(Call<List<BookTest>> call, Response<List<BookTest>> response) {
                if(response.isSuccessful() && response.body()!=null && response.code()==200)
                {
                    List<BookTest> bookList=response.body();

                }
                else
                {

                }
                progressDialog.cancel();
            }

            @Override
            public void onFailure(Call<List<BookTest>> call, Throwable t) {

                if(t!=null)
                    progressDialog.cancel();
                if(t.getMessage()!=null)
                    Log.e("Error",t.getMessage());
            }
        });
    }
}
