package com.example.mechtatz.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.mechtatz.R
import com.example.mechtatz.databinding.ItemSmartphoneBinding
import com.example.mechtatz.databinding.ItemSmartphoneDetailsBinding
import com.example.mechtatz.network.Item
import com.example.mechtatz.network.MainProperty


class SmartPhoneDetailAdapter(private val context: Context) :
    RecyclerView.Adapter<SmartPhoneDetailAdapter.ViewHolder>() {


    private var data = mutableListOf<MainProperty>()
    class ViewHolder(val binding: ItemSmartphoneDetailsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SmartPhoneDetailAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemSmartphoneDetailsBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SmartPhoneDetailAdapter.ViewHolder, position: Int) {
        if (position % 2 == 0) {
            holder.binding.root.setBackgroundResource(R.color.white)
        } else {
            holder.binding.root.setBackgroundResource(R.color.gray_4E5053)
        }
        holder.binding.itemName.text = data[position].propValue
        holder.binding.itemBrand.text = data[position].propName


    }

    fun setList(list: List<MainProperty>) {
        this.data = list as MutableList<MainProperty>
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
