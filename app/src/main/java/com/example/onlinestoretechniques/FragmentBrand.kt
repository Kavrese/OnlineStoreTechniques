package com.example.onlinestoretechniques

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlinestoretechniques.model.ModelProductBrand
import kotlinx.android.synthetic.main.fragment_brand.*
import kotlinx.android.synthetic.main.fragment_main.*

class FragmentBrand(private val nameBrand: String, private val lists: ModelProductBrand): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_brand, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        text_brand.text = nameBrand
        initAllRec()
    }

    private fun initAllRec(){
        if (lists.listPhones.size != 0) {
            rec_brand_phones.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listPhones, R.layout.item_small)
            }
        }else{
            lin_phones.visibility = View.GONE
        }

        if (lists.listTablets.size != 0) {
            rec_brand_tablets.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listTablets, R.layout.item_small)
            }
        }else{
            lin_tablets.visibility = View.GONE
        }

        if (lists.listMice.size != 0) {
            rec_brand_mice.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listMice, R.layout.item_small)
            }
        }else{
            lin_mice.visibility = View.GONE
        }

        if (lists.listCamera.size != 0) {
            rec_brand_cameras.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listCamera, R.layout.item_small)
            }
        }else{
            lin_cameras.visibility = View.GONE
        }

        if (lists.listLaptops.size != 0) {
            rec_brand_laptops.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listLaptops, R.layout.item_small)
            }
        }else{
            lin_laptops.visibility = View.GONE
        }

        if (lists.listHead.size != 0) {
            rec_brand_headphones.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listHead, R.layout.item_small)
            }
        }else{
            lin_headphones.visibility = View.GONE
        }

        if (lists.listKey.size != 0) {
            rec_brand_keyboards.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listKey, R.layout.item_small)
            }
        }else{
            lin_keyboards.visibility = View.GONE
        }

        if (lists.listTv.size != 0) {
            rec_brand_tv.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listTv, R.layout.item_small)
            }
        }else{
            lin_tv.visibility = View.GONE
        }

        if (lists.listWatch.size != 0) {
            rec_brand_watch.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listWatch, R.layout.item_small)
            }
        }else{
            lin_watch.visibility = View.GONE
        }

        if (lists.listPrint.size != 0) {
            rec_brand_printers.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = AdapterProduct(lists.listPrint, R.layout.item_small)
            }
        }else{
            lin_printers.visibility = View.GONE
        }
    }
}