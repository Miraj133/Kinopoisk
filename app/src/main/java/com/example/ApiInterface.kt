package com.example

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/api/v2.2/films/")
    fun getMovies(): Call<List<Movie>>

    companion object{
        vaR
    }

}