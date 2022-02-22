package com.example.myapplica

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplica.Common.Common
import com.example.myapplica.databinding.ActivityMainBinding
import dmax.dialog.SpotsDialog
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "test666"
    }

    lateinit var binding: ActivityMainBinding
    lateinit var mService: ApiInterface
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: MyMovieListAdapter
    lateinit var dialog: android.app.AlertDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        mService = Common.retrofitService
        binding.rvMovie.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        binding.rvMovie.layoutManager = layoutManager
        dialog = SpotsDialog.Builder().setCancelable(true).setContext(this).build()

        getAllMovieList()
    }

    private fun getAllMovieList() {
        dialog.show()
        mService.getMovieList().enqueue(object : Callback<ResponseData> {
            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                Log.d(TAG, "onFailure: ")
            }

            override fun onResponse(
                call: Call<ResponseData>,
                response: Response<ResponseData>
            ) {
                Log.d(TAG, "onResponse: ")
                adapter = MyMovieListAdapter(baseContext, response.body() as List<Result>)
                adapter.notifyDataSetChanged()
                binding.rvMovie.adapter = adapter
                dialog.dismiss()
            }
        })
    }
}