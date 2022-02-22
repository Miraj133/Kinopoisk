package com.example.myapplica

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplica.databinding.ItemMovieBinding


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    lateinit var binding: ItemMovieBinding
    fun bind(listItem: Result) {
        binding.ivImageMovie.setOnClickListener {
            Toast.makeText(it.context, "нажал на ${binding.ivImageMovie}", Toast.LENGTH_SHORT)
                .show()
        }
        itemView.setOnClickListener {
            Toast.makeText(it.context, "нажал на ${binding.tvName}", Toast.LENGTH_SHORT).show()
        }
    }
}