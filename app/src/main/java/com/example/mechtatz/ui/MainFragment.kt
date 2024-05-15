package com.example.mechtatz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mechtatz.R
import com.example.mechtatz.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val viewmodel by viewModels<MainViewmodel>()
    private lateinit var adapter: SmartPhonesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        adapter = SmartPhonesAdapter(requireContext())
        binding.smartPhonesRv.adapter = adapter
        binding.smartPhonesRv.apply {
            layoutManager = GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)
            adapter = adapter
        }
        viewmodel.getSmartphones(page = 1, pageLimit = 30, section = "smartfony")
        viewmodel.smartPhones.observe(viewLifecycleOwner) {
            adapter.setList(it.data.items)
        }

        adapter.onItemClick = { order ->
            findNavController().navigate(R.id.action_mainFragment_to_detailsFragment)
        }
        return binding.root
    }

    companion object {

    }
}