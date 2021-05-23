package com.gicm.ojt.androidretrofitapi.models

data class AccountModel(
    val id: Int,
    val name: String,
    val role: String,
    val update_flg: Int,
    val delete_flg: Int
)