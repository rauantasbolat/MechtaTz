package com.example.mechtatz.ui

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.mechtatz.databinding.ItemSmartphoneBinding
import com.example.mechtatz.network.Item
import com.example.mechtatz.network.Resp

class SmartPhonesAdapter(private val context: Context) : RecyclerView.Adapter<SmartPhonesAdapter.ViewHolder>() {
    private var data = mutableListOf<Item>()
    var onItemClick: ((Item) -> Unit)? = null



    class ViewHolder(val binding: ItemSmartphoneBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SmartPhonesAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemSmartphoneBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SmartPhonesAdapter.ViewHolder, position: Int) {
        holder.binding.smartPhoneName.text = data[position].title
        holder.binding.smartPhonePrice.text = data[position].price.toString()
        holder.binding.smartPhoneButton.setOnClickListener{
            Log.d("AdapterClicked", position.toString())
        }
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(data[position])
        }

        val d = data[position].photos[0]
        val glideUrl = GlideUrl(d, LazyHeaders.Builder()
            .build())
        Glide
            .with(context)
            .load(glideUrl)
            .into(holder.binding.smartPhonePhoto)

    }

    fun setList(list: List<Item>) {
        this.data = list as MutableList<Item>
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}