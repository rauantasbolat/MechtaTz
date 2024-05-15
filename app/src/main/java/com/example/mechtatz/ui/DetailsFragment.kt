package com.example.mechtatz.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mechtatz.R
import com.example.mechtatz.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private val viewmodel by viewModels<DetailsViewModel>()
    private lateinit var adapter: SmartPhoneDetailAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        viewmodel.getSmartPhoneDetails()
        viewmodel.smartPhone.observe(viewLifecycleOwner){
            adapter = SmartPhoneDetailAdapter(requireContext())
            binding.detailsRecyclerView.adapter = adapter

            adapter.setList(it)

            binding.detailsRecyclerView.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = adapter
            }

            Log.d("DetaildFragment", it.toString())
        }



        return binding.root
    }

    companion object {
    }
}