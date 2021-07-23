package com.example.workindiatanishqsrivastava

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product_cardview.view.*

class ProductAdapter(private val productList : List<ProductItem>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val productView=LayoutInflater.from(parent.context).inflate(R.layout.product_cardview,parent,false)
        return ProductViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentItem = productList[position]

        holder.imageView.setImageResource(currentItem.productimage)
        holder.prodidView.text =currentItem.product_id
        holder.priceView.text=currentItem.price
    }

    override fun getItemCount() = productList.size

    class ProductViewHolder(productView : View) : RecyclerView.ViewHolder(productView) {
        val imageView: ImageView = productView.product_img
        val prodidView : TextView = productView.prod_id
        val priceView : TextView = productView.price

    }
}
