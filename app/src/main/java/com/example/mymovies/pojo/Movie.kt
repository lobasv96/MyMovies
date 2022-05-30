package com.example.mymovies.pojo

import com.google.gson.annotations.SerializedName


data class Results (
    @SerializedName("results")
    val movie: List<Movie>
        )

data class Movie (
    val display_title: String,
    val summary_short: String,
    val multimedia: List<Multimedia>
        )

data class Multimedia (
    val src: String
        )

