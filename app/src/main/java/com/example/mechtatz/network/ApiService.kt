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
}