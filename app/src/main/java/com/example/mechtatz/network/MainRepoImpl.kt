package com.example.mechtatz.network

import com.example.mechtatz.model.SmartPhonesResponse
import com.example.mechtatz.repo.MainRepo
import retrofit2.Response


class MainRepoImpl(private val service: ApiService) : MainRepo {
    override suspend fun getSmartPhones(
        page: Int,
        pageLimit: Int,
        section: String
    ): Response<Resp> = service.getSmartphones(page = page, pageLimit = pageLimit, section = section)
}