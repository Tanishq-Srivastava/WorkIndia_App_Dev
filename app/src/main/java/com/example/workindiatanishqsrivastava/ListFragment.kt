package com.example.workindiatanishqsrivastava

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_gridview.*

class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val productList = generateDummyList()
        product_recycler_view.adapter = ProductAdapter(productList)
        product_recycler_view.layoutManager = LinearLayoutManager(requireContext())

    }

    private fun generateDummyList(): List<ProductItem>
    {
        val list = ArrayList<ProductItem>()
        var item=ProductItem(R.drawable.dummy,"Item1","₹2,231","Same Day Shipping")
        list += item
        item=ProductItem(R.drawable.dummy,"Item2","₹2,231","Same Day Shipping")
        list += item
        item=ProductItem(R.drawable.dummy,"Item3","₹3599","")
        list += item
        item=ProductItem(R.drawable.dummy,"Item4","₹2,251","")
        list += item
        item=ProductItem(R.drawable.dummy,"Item5","₹3759","")
        list += item
        return list
    }
}