package com.example.myapplica

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class MyMovieListAdapter(
    private val context: Context,
    private val movieList: List<Result>//уточнить
) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = movieList[position]
        holder.bind(listItem)

        Picasso.with(context)
            .load(movieList[position].image).into(holder.binding.ivImageMovie)
        holder.binding.tvName.text = movieList[position].name
        holder.binding.tvStatus.text = movieList[position].status
        holder.binding.tvSpecies.text = movieList[position].species
    }

    override fun getItemCount() = movieList.size
}