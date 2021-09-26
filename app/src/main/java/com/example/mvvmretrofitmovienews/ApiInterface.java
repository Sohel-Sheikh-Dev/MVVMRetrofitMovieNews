package com.example.mvvmretrofitmovienews;

import static com.example.mvvmretrofitmovienews.Constants.BASE_API;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("movie/popular?api_key="+BASE_API)
    Call<MovieResponse> getPopularMovies();

}
