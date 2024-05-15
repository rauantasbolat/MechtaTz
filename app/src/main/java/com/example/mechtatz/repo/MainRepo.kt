package com.example.mechtatz.repo

import com.example.mechtatz.model.SmartPhonesResponse
import com.example.mechtatz.network.ItemResp
import com.example.mechtatz.network.Resp
import retrofit2.Response

interface MainRepo {
    suspend fun getSmartPhones(page: Int, pageLimit: Int, section: String): Response<Resp>

    suspend fun getSmartPhoneDetails(): Response<ItemResp>

}