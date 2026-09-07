package com.but.cinelist.domain

import com.but.cinelist.domain.api.NetworkDataSource
import com.but.cinelist.model.Animes
import com.but.cinelist.model.TVs
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import retrofit2.Response

object AnimesRepository {

    suspend fun getAnimes() : Flow<Response<Animes>> = flow {
        //emet la valeur
        emit(NetworkDataSource.apiService.getAnimes(""))
    }

}