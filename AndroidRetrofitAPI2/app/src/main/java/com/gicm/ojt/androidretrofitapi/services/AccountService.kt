package com.gicm.ojt.androidretrofitapi.services

import com.gicm.ojt.androidretrofitapi.models.AccountModel

import retrofit2.Call
import retrofit2.http.GET

interface AccountService {
    // Account Listを取得する。
    @GET("/getAccList")
    fun getAccList(): Call<List<AccountModel>>
}