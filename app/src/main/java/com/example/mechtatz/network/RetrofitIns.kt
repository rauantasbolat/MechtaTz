package com.example.mechtatz.network

import io.grpc.okhttp.internal.Util
import okhttp3.OkHttpClient
import okhttp3.Protocol
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.net.ssl.X509TrustManager


const val TIME_OUT = 180L
object RetrofitIns {

    fun getRetrofitInstance(): ApiService {
        val okHttp = OkHttpClient.Builder()
            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
        val builder = Retrofit.Builder()
            .baseUrl("https://www.mechta.kz/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttp.build())
        val retrofit = builder.build()
        return retrofit.create(ApiService::class.java)
    }
}