package com.example.muxichallenge

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    private var context: Context,
    var dataList: ArrayList<Fruit>
): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    lateinit var onClickFruitHandle: OnClickFruitHandle
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
        holder.fruitName.text=fruit.name
        holder.fruitPrice.text="$ " + fruit.price.toString()
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!), View.OnClickListener {

        override fun onClick(p0: View?) {
            onClickFruitHandle.onClick(dataList[adapterPosition])
        }
        var fruitName:TextView =itemView!!.findViewById(R.id.fruit_name)
        var fruitPrice:TextView =itemView!!.findViewById(R.id.fruit_price)

        init {
            itemView!!.setOnClickListener(this)
        }
    }

    fun setOnClickFruit(clickHandle: OnClickFruitHandle){
        this.onClickFruitHandle = clickHandle
    }
}