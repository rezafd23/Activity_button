package com.example.rezafd.activity_button.API;

import com.example.rezafd.activity_button.Response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by REZAFD on 19/12/2017.
 */

public interface ApiService {
    @FormUrlEncoded
    @POST("login.php")
    Call<LoginResponse> login (@Field("Username") String username,
                               @Field("Password") String pwd);
}
