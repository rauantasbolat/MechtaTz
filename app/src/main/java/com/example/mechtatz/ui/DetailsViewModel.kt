package com.example.mechtatz.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mechtatz.network.ItemResp
import com.example.mechtatz.network.MainProperty
import com.example.mechtatz.network.MainRepoImpl
import com.example.mechtatz.network.Resp
import com.example.mechtatz.network.RetrofitIns
import com.example.mechtatz.repo.MainRepo
import kotlinx.coroutines.launch
import org.json.JSONArray

class DetailsViewModel : ViewModel() {

    private val _smartPhone = MutableLiveData<List<MainProperty>>()
    val smartPhone: LiveData<List<MainProperty>>
        get() = _smartPhone




    fun getSmartPhoneDetails() {
        viewModelScope.launch {
            try {
                val response = getRepo().getSmartPhoneDetails()
                if (response.isSuccessful) {
                    val jsonArray = JSONArray(response.body()!!.data.mainProperties)
                    _smartPhone.postValue(response.body()!!.data!!.mainProperties)
                    Log.d("MainViewmodelDetailsResponse", response.body().toString())
                }
            } catch (e: Exception) {
                Log.d("MainViewmodelDetailsResponse", e.toString())
            }
        }
    }

    fun getRepo() : MainRepo {
        return MainRepoImpl(RetrofitIns.getRetrofitInstance())
    }
}