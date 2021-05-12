package com.example.recyclerviewinkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs:List<Song>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater :LayoutInflater= LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.layout,parent,false)
        return MyViewHolder(view);
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txttitle.text = songs[position].title
        holder.txtDescription.text = songs[position].description
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var txttitle = itemView.findViewById<TextView>(R.id.textView)
        var txtDescription = itemView.findViewById<TextView>(R.id.textView2)
    }

}