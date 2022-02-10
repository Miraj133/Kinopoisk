package com.example.myapplica

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/character")
    fun getMovieList(): Call<MutableList<ResponseData>>
}