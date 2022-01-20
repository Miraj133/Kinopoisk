package com.example.myapplica

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    //private var retrofit: Retrofit? = null


    fun getClient(basUrl:String): Retrofit{
        val retrofit = Retrofit.Builder(){
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(basUrl)
                .build()
        }
        return retrofit!!
    }

}

