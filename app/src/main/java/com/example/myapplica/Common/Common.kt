package com.example.myapplica.Common

import com.example.myapplica.RetrofitClient
import com.example.myapplica.ApiInterface

object Common {
    private val BASE_URL = "https://rickandmortyapi.com/api"
    val retrofitService: ApiInterface
        get() = RetrofitClient.getClient(BASE_URL).create(ApiInterface::class.java)
}