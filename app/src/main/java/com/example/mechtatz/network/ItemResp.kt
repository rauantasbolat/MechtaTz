package com.example.mechtatz.network

import com.google.gson.annotations.SerializedName

data class ItemResp(
    val data: DataItem,
    val errors: List<Any>,
    val result: Boolean
)

data class DataItem(
    val availability: String,
    val bonus: Int,
    val breadcrumbs: List<Breadcrumb>,
    val cityExist: Boolean,
    val code: String,
    val code1c: String,
    val digital: Boolean,
    val equalProductsModelId: Int,
    val express: Boolean,
    val expressDelivery: Boolean,
    val gifts: List<Any>,
    val hasGift: Boolean,
    val id: Int,
    val inBasket: Boolean,
    val inCompare: Boolean,
    val inFavorites: Boolean,
    val isIntercity: Boolean,
    val kaspiCode: String,
    @SerializedName("main_properties")
    val mainProperties: List<MainProperty>,
    val metaTags: MetaTags,
    val metrics: Metrics,
    val name: String,
    val newItem: Boolean,
    val onlyVit: Boolean,
    val photos: List<String>,
    val podOrderItem: Boolean,
    val podOrderTime: Any,
    val preorder: Boolean,
    val preorderLink: Any,
    val preorderStart: Any,
    val preorderSum: Any,
    val price: Int,
    val prices: Prices,
    val rating: Int,
    val reviewsCount: Int,
    val sameProductProperties: List<String>,
    val service: Boolean,
    val stickers: List<Any>,
    val title: String,
    val type: Int,
    val videoLink: Any,
    val xmlId: String
)


data class MainProperty(
    val code: String,
    val propId: Int,
    @SerializedName("prop_name")
    val propName: String,
    val propNameDescription: String,
    @SerializedName("prop_value")
    val propValue: String,
    val sectionCode: Any
)

