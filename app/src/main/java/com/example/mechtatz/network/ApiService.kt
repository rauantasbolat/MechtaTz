package com.example.mechtatz.network

import com.example.mechtatz.model.SmartPhonesResponse
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("catalog")
    suspend fun getSmartphones(
        @Query("page") page: Int,
        @Query("page_limit") pageLimit: Int,
        @Query("section") section: String
    ): Response<Resp>

    @GET("product/telefon-sotovyy-samsung-sm-s-928-galaxy-s24-ultra-5g-256gb-bzkgs-titanium-black")
    suspend fun getSmartphonesDetails() : Response<ItemResp>
}