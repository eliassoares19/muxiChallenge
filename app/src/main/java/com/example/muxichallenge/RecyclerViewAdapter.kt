package com.example.muxichallenge

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private var context: Context,private var dataList:ArrayList<Fruit>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return dataList.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.list_item_view,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //Set up textview with data
        val fruit: Fruit = dataList[position]
        holder.textView.text=fruit.name
        holder.textView2.text=fruit.image
        holder.textView3.text= fruit.price.toString()
    }


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var textView:TextView =itemView!!.findViewById(R.id.text_view)
        var textView2:TextView =itemView!!.findViewById(R.id.text_view2)
        var textView3:TextView =itemView!!.findViewById(R.id.text_view3)
    }
}