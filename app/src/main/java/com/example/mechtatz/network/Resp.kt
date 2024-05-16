package com.example.mechtatz.network

import com.google.gson.annotations.SerializedName

data class Resp(
    @SerializedName("data")
    val data: Data
)

data class Data(
    val items: List<Item>
)

data class Item(
    val code: String,
    val photos: List<String>,
    val price: Int,
    val title: String
)


