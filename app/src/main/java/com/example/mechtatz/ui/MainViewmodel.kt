package com.example.mechtatz.ui

import android.net.Network
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mechtatz.model.SmartPhonesResponse
import com.example.mechtatz.network.MainRepoImpl
import com.example.mechtatz.network.Resp
import com.example.mechtatz.network.RetrofitIns
import com.example.mechtatz.repo.MainRepo
import kotlinx.coroutines.launch
import okhttp3.internal.connection.Exchange

class MainViewmodel : ViewModel() {
    private val _smartPhones = MutableLiveData<Resp>()
    val smartPhones: LiveData<Resp>
        get() = _smartPhones


    fun getSmartphones(page: Int, pageLimit: Int, section: String) {
        viewModelScope.launch {
            try {
                val response = getRepo().getSmartPhones(page = page, pageLimit = pageLimit, section = section)
                if (response.isSuccessful) {
                    _smartPhones.value = response.body()
                    Log.d("MainViewmodelResponse", response.body().toString())
                }
            } catch (e: Exception) {
                Log.d("MainViewmodelResponse", e.toString())
            }
        }

    }

    fun getRepo() : MainRepo {
        return MainRepoImpl(RetrofitIns.getRetrofitInstance())
    }
}