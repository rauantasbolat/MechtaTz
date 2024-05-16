package com.example.mechtatz.network

import com.google.gson.annotations.SerializedName

data class ItemResp(
    @SerializedName("data")
    val data: DataItem
)

data class DataItem(
    @SerializedName("main_properties")
    val mainProperties: List<MainProperty>,
    val photos: List<String>,
    val price: Int,
    val title: String
)


data class MainProperty(
    @SerializedName("prop_name")
    val propName: String,
    @SerializedName("prop_value")
    val propValue: String,
)

