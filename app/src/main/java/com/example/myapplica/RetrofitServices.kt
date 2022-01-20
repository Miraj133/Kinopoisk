package com.example.myapplica

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {

    @GET("/api/v2.2/films")
    fun getMovieList(): Call<MutableList<Movie>>
}