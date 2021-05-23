package com.gicm.ojt.androidretrofitapi.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    private const val URL ="http://192.168.100.19:9090/"

    //CREATE HTTP CLIENT
    private val okHttp = OkHttpClient.Builder()

    //retrofit builder
    private val retrofit_builder = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())

    /*val retro = Retrofit.Builder()
            .baseUrl(URL_ACCOUNT_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build()*/

    //create retrofit Instance
    private val retrofit = retrofit_builder.build()

    // Create the service variable
    fun <T> buildService (serviceType :Class<T>):T{
        return retrofit.create(serviceType)
    }
}