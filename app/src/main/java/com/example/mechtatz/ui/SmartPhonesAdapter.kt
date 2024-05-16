package com.example.mechtatz.ui

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mechtatz.databinding.ItemSmartphoneBinding
import com.example.mechtatz.network.Item
import com.example.mechtatz.network.Resp
import javax.inject.Inject

class SmartPhonesAdapter @Inject() constructor() :
    PagingDataAdapter<Item, SmartPhonesAdapter.ViewHolder>(differCallback)
{
    private lateinit var binding: ItemSmartphoneBinding
    private lateinit var context: Context



    inner class ViewHolder : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : Item) {
            binding.apply {
                smartPhoneName.text = item.title
                smartPhonePrice.text = item.price.toString()
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        context = parent.context
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemSmartphoneBinding.inflate(inflater, parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: SmartPhonesAdapter.ViewHolder, position: Int) {
    holder.bind(getItem(position)!!)
        holder.setIsRecyclable(false)
    }

    override fun getItemCount(): Int {
        return super.getItemCount()
    }

    companion object {
        val differCallback = object : DiffUtil.ItemCallback<Item>() {
            override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
                return oldItem == oldItem
            }

            override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
                return oldItem == newItem
            }
        }
    }
}