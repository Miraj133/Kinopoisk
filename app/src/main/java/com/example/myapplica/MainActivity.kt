package com.example.myapplica

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplica.Common.Common
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "test666"
    }

    lateinit var mService: ApiInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mService = Common.retrofitService
        getAllMovieList()
    }

    private fun getAllMovieList() {
        mService.getMovieList().enqueue(object : Callback<MutableList<ResponseData>> {
            override fun onFailure(call: Call<MutableList<ResponseData>>, t: Throwable) {
                Log.d(TAG, "onFailure: ")
            }

            override fun onResponse(
                call: Call<MutableList<ResponseData>>,
                response: Response<MutableList<ResponseData>>
            ) {
                Log.d(TAG, "onResponse: ")
            }
        })
    }
}