package com.example.mymovies.api

import com.example.mymovies.pojo.Results
import retrofit2.Call
import retrofit2.http.GET


interface DownloadMovies {
    @GET("all.json?api-key=EeMoFYdldGSJe66nxGbROKhhnaoJRsP4")
    suspend fun getAllFilms() : Results
}