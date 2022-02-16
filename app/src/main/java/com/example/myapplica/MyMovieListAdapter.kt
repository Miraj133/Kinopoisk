package com.example.myapplica

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplica.databinding.ItemMovieBinding

class MyMovieListAdapter(
    private val context: Context,
    private val movieList: MutableList<ResponseData>
) : RecyclerView.Adapter<MyMovieListAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var binding: ItemMovieBinding
        fun bind(listItem: ResponseData) {
           binding.ivImageMovie
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}