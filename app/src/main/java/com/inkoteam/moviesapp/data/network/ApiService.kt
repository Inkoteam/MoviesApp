package com.inkoteam.moviesapp.data.network

import com.inkoteam.moviesapp.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

/* Интерфейс для хз чего) пока сложно, но ничего нового */
interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies (): Response<List<Movies>>
}