package com.example.mechtatz.ui


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.mechtatz.network.SmartPhonePagination
import com.example.mechtatz.repo.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewmodel @Inject constructor(private val repo: MainRepo) : ViewModel() {
    val smartPhones = Pager(PagingConfig(10)) {
        SmartPhonePagination(repo)
    }.flow.cachedIn(viewModelScope)


}