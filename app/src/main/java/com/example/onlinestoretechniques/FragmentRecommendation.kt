package com.example.onlinestoretechniques

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestoretechniques.model.ModelProduct
import kotlinx.android.synthetic.main.recommendation_fragment.*

class FragmentRecommendation: Fragment() {
    var listWork = mutableListOf<ModelProduct>()
    var listFun = mutableListOf<ModelProduct>()
    var listRelax = mutableListOf<ModelProduct>()
    var listBest = mutableListOf<ModelProduct>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recommendation_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        listWork = DataProducts().listLaptops.toMutableList()
        rec_work.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        rec_best.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        rec_work.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        rec_fun.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        updateAllRec()
    }

    private fun updateRec (rec: RecyclerView, adapter: AdapterProduct){
        rec.adapter = adapter
    }

    private fun updateAllRec (){
        rec_work.adapter = AdapterProduct(listWork, R.layout.item_small)
        rec_fun.adapter = AdapterProduct(listFun, R.layout.item_small)
        rec_relax.adapter = AdapterProduct(listRelax, R.layout.item_small)
        rec_best.adapter = AdapterProduct(listBest, R.layout.item_small)
    }
}