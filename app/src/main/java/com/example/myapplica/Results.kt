package com.example.myapplica

import android.location.Location
import java.util.*

data class Results(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String?,
    val gender: String,
    val origin: List<Origin>,
    val location: List<Location>,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: Calendar //уточнить у Рустема

)
