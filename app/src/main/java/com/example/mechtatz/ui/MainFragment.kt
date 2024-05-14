package com.example.mechtatz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.mechtatz.R


class MainFragment : Fragment() {
    private val viewmodel by viewModels<MainViewmodel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewmodel.getSmartphones(page = 1, pageLimit = 30, section = "smartfony")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {

    }
}