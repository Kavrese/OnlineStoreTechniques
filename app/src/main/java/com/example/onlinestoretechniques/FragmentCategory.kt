package com.example.onlinestoretechniques

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestoretechniques.model.ModelProduct
import kotlinx.android.synthetic.main.category_fragment.*

class FragmentCategory(private val nameCategory: String, private val listCategory: MutableList<ModelProduct>): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.category_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        category_text.text = nameCategory
        rec_category.apply {
            layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
            adapter = AdapterProduct(listCategory, R.layout.item_small)
        }
        if (listCategory.size == 0) {
            text_no.visibility = View.VISIBLE
        }else{
            text_no.visibility = View.INVISIBLE
        }
    }
}