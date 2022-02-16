package com.example.myapplica

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("api/character")
    fun getMovieList(): Call<ResponseData>
}