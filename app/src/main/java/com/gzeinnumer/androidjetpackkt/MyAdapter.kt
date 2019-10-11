package com.gzeinnumer.androidjetpackkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyAdapter(private val list: List<PostItem>) : RecyclerView.Adapter<MyAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bindItem(list[position])
    }

    class MyHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bindItem(get: PostItem){
            itemView.item_tv.text = get.text
        }
    }
}