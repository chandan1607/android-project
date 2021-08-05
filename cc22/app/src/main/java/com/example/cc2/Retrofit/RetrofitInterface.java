package com.example.cc2.Retrofit;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitInterface {
    @GET("v6/68e210a8f9cd4c13421dc182/latest/{currency}")
    Call<JsonObject> getExchangeCurrency(@Path("currency") String currency);
}