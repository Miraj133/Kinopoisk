package com.example.myapplica.Common

import com.example.myapplica.RetrofitClient
import com.example.myapplica.RetrofitServices
import retrofit2.create

object Common {
    private val BASE_URL = "https://kinopoiskapiunofficial.tech"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}