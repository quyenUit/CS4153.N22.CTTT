package com.example.bt_android7;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public abstract class Api {
    static String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    abstract Call<List<Results>> getsuperHeroes() ;
}
