package com.example.mymovies.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {

    private const val API_KEY = "EeMoFYdldGSJe66nxGbROKhhnaoJRsP4"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.nytimes.com/svc/movies/v2/reviews/")
        .build()

    val downloadMovies = retrofit.create(DownloadMovies::class.java)

}