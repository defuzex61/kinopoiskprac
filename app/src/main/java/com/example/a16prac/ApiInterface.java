package com.example.a16prac;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiInterface {
    @Headers({"X-API-KEY: тут условный апи ключ",
            "Content-Type: application/json"})
    @GET("api/v2.2/films/collections?type=TOP_POPULAR_ALL&page=1")
    Call<ItemsPage> getListFilms();

    @Headers({"X-API-KEY: тут условный апи ключ ",
            "Content-Type: application/json"})
    @GET("api/v2.2/films")
    Call<ItemsPage> getListExpectedFilms();

    @Headers({"X-API-KEY: тут условный апи ключ",
            "Content-Type: application/json"})
    @GET("api/v2.2/films/{id}")
    Call<Items> getListFilmInfo(@Path("id") int id);



}
