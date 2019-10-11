package com.gzeinnumer.androidjetpackkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
    }

    class MyHolder(val view : View) : RecyclerView.ViewHolder(view)
}