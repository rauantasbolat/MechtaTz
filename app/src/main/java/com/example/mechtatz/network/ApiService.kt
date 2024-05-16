package com.example.mechtatz.network

import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("catalog")
    suspend fun getSmartphones(
        @Query("page") page: Int,
        @Query("page_limit") pageLimit: Int,
        @Query("section") section: String
    ): Response<Resp>

    @GET("product/{product}")
    suspend fun getSmartphonesDetails(
        @Path("product") product: String) : Response<ItemResp>
}