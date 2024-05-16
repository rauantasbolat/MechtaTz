package com.example.mechtatz.repo

import com.example.mechtatz.network.ApiService
import com.example.mechtatz.network.ItemResp
import com.example.mechtatz.network.Resp
import retrofit2.Response
import javax.inject.Inject

class MainRepo @Inject constructor(
    private val service: ApiService
) {
    suspend fun getSmartPhones(page: Int, pageLimit: Int, section: String): Response<Resp> = service.getSmartphones(page, pageLimit, section)

    suspend fun getSmartPhoneDetails(section: String): Response<ItemResp> = service.getSmartphonesDetails(section)

}