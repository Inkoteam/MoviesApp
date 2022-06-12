package com.inkoteam.moviesapp.data.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getAllmovies() = apiService.getAllMovies()

}