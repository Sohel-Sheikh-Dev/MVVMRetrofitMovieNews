package com.example.mvvmretrofitmovienews;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MovieResponse {

    @SerializedName("results")
    public List<Model> getPopMovies;

    public MovieResponse(List<Model> getPopMovies) {
        this.getPopMovies = getPopMovies;
    }

    public List<Model> getGetPopMovies() {
        return getPopMovies;
    }

    public void setGetPopMovies(List<Model> getPopMovies) {
        this.getPopMovies = getPopMovies;
    }
}
