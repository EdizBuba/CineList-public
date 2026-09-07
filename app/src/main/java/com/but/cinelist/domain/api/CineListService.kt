package com.but.cinelist.domain.api

import com.but.cinelist.model.Animes
import com.but.cinelist.model.TVs
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CineListService {
    @GET("tv/id")
    suspend fun getAnimes(
        @Query("id") id: String
    ): Response<Animes>

    @GET("anime/id")
    suspend fun getTVs(
        @Query("id") id: String
    ): Response<TVs>
}