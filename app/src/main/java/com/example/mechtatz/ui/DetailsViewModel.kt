package com.example.mechtatz.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mechtatz.network.DataItem
import com.example.mechtatz.network.ItemResp
import com.example.mechtatz.network.MainProperty
import com.example.mechtatz.network.MainRepoImpl
import com.example.mechtatz.network.Resp
import com.example.mechtatz.network.RetrofitIns
import com.example.mechtatz.repo.MainRepo
import kotlinx.coroutines.launch
import org.json.JSONArray

class DetailsViewModel : ViewModel() {

    /*private val _smartPhone = MutableLiveData<List<MainProperty>>()
    val smartPhone: LiveData<List<MainProperty>>
        get() = _smartPhone

    private val _itemDetails = MutableLiveData<DataItem>()
    val itemDetails: LiveData<DataItem>
        get() = _itemDetails




    fun getSmartPhoneDetails(item: String) {
        viewModelScope.launch {
            try {
                val response = getRepo().getSmartPhoneDetails(item)
                if (response.isSuccessful) {
                    _smartPhone.postValue(response.body()!!.data.mainProperties)
                    _itemDetails.postValue(response.body()!!.data)
                    Log.d("MainViewmodelDetailsResponse", response.body().toString())
                }
            } catch (e: Exception) {
                Log.d("MainViewmodelDetailsResponse", e.toString())
            }
        }
    }*/

    /*fun getRepo() : MainRepo {
        return MainRepoImpl(RetrofitIns.getRetrofitInstance())
    }*/
}