package com.but.cinelist.domain.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber

object NetworkDataSource {
    private const val BASE_URL = "https://api.simkl.com/"


    private val logInterceptor = HttpLoggingInterceptor { message ->
        Timber.tag(
            "OkHttp"
        ).d(message)
    }.apply { level = HttpLoggingInterceptor.Level.NONE }

    private val okHttp = OkHttpClient.Builder()
        .addNetworkInterceptor(logInterceptor)
//	.addInterceptor(get<ErrorInterceptor>())
//	.addInterceptor(get<AuthenticatorInterceptor>())
        .build()

    private val retrofit =
        Retrofit.Builder()
            .client(okHttp)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()



    val apiService = retrofit.create(CineListService::class.java)

















}