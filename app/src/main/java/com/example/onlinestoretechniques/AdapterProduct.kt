package com.example.onlinestoretechniques

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestoretechniques.model.ModelProduct
import com.squareup.picasso.Picasso

class AdapterProduct(var list: MutableList<ModelProduct>, var idItem: Int): RecyclerView.Adapter<AdapterProduct.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.text_name)
        val price: TextView = itemView.findViewById(R.id.text_price)
        val img: ImageView = itemView.findViewById(R.id.img)
        val brend: TextView = itemView.findViewById(R.id.text_brend)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(idItem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = list[position].name
        holder.brend.text = list[position].brend
        holder.price.text = list[position].price
        Picasso.get()
            .load(list[position].photos[0])
            .into(holder.img)
    }

    override fun getItemCount(): Int = list.size
}