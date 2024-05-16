package com.example.mechtatz.network

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.mechtatz.repo.MainRepo

class SmartPhonePagination(private val repo: MainRepo) : PagingSource<Int, Item>() {
    override fun getRefreshKey(state: PagingState<Int, Item>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Item> {
        return try {
            val currentPage = params.key ?: 1
            val response = repo.getSmartPhones(page = currentPage, pageLimit = 20, section = "smartfony")

            if (response.isSuccessful) {
                Log.d("RESPONSERAUANTRUE", "true")
            } else {
                Log.d("RESPONSERAUANTRUE", "false")

            }
            val _smartPhones = response.body()?.data?.items
            Log.d("RESPONSERAUANTRUE", _smartPhones.toString())

            val data = mutableListOf<Item>()
            data.addAll(_smartPhones!!)

            LoadResult.Page(
                data = data,
                prevKey = if (currentPage == 1) null else -1,
                nextKey = currentPage.plus(1)
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }
}