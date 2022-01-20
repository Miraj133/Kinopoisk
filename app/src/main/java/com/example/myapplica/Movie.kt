package com.example.myapplica


data class Movie(
    val kinopoiskId: Int,
    val imdb: Int?,
    val nameRu: String,
    val nameEn: String,
    val nameOriginal: String,
    val posterUrl: String,
    val posterPreview: String,
    val reviewCount: Int,
    val ratingGoodReview: Float,
    val ratingGoodReviewVoteCount: Long,
    val ratingKinopoisk: Float,
    val ratingKinopoiskVoteCount: Long,
    val ratingImdb: Int?,
    val ratingImdbVoteCount: Long?,
    val ratingFilmCritics: Int,
    val ratingFilmCriticsVoteCount: Int,
    val ratingAwait: Float,
    val ratingAwaitCount: Int,
    val ratingRfCritics: Float,
    val ratingRfCriticsVoteCount: Int,
    val webUrl: String,
    val year: Int,
    val filmLength: Int,
    val slogan: String?,
    val description: String
)