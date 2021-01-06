package com.example.onlinestoretechniques

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlinestoretechniques.model.ModelProductBrand
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.lin_brands.*
import kotlinx.android.synthetic.main.lin_category.*

class FragmentMain: Fragment(){
    var list_hot = DataProducts().listPhones.toMutableList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rec_hot.apply{
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
        updateAdapterRec()
        setFragment(FragmentRecommendation())

        initClickCategory()
        initClickBrand()
    }

    private fun initClickBrand() {
        cat_apple.setOnClickListener {
            setFragment(FragmentBrand("Apple", ModelProductBrand()))
        }
        cat_sony.setOnClickListener {
            setFragment(FragmentBrand("Sony", ModelProductBrand()))
        }
        cat_xiami.setOnClickListener {
            setFragment(FragmentBrand("Xiami", ModelProductBrand()))
        }
        cat_huawei.setOnClickListener {
            setFragment(FragmentBrand("Huawei", ModelProductBrand()))
        }
        cat_honor.setOnClickListener {
            setFragment(FragmentBrand("Honor", ModelProductBrand()))
        }
        cat_oppo.setOnClickListener {
            setFragment(FragmentBrand("Oppo", ModelProductBrand()))
        }
        cat_nokia.setOnClickListener {
            setFragment(FragmentBrand("Nokia", ModelProductBrand()))
        }
    }

    private fun initClickCategory(){
        card_main.setOnClickListener {
            setFragment(FragmentRecommendation())
            card_main.visibility = View.GONE
        }

        card_watch.setOnClickListener {setFragment(FragmentCategory("Watch", DataProducts().listWatch))
            card_main.visibility = View.VISIBLE}
        card_cameras.setOnClickListener {setFragment(FragmentCategory("Cameras", DataProducts().listCamera))
            card_main.visibility = View.VISIBLE}
        card_head.setOnClickListener {setFragment(FragmentCategory("Headphones", DataProducts().listHead))
            card_main.visibility = View.VISIBLE}
        card_keyboards.setOnClickListener {setFragment(FragmentCategory("Keyboards", DataProducts().listKey))
            card_main.visibility = View.VISIBLE}
        card_printers.setOnClickListener{setFragment(FragmentCategory("Printers", DataProducts().listPrint))
            card_main.visibility = View.VISIBLE}
        card_phones.setOnClickListener{setFragment(FragmentCategory("Phones", DataProducts().listPhones))
            card_main.visibility = View.VISIBLE}
        card_laptop.setOnClickListener{setFragment(FragmentCategory("Laptops", DataProducts().listLaptops))
            card_main.visibility = View.VISIBLE}
        card_mice.setOnClickListener{setFragment(FragmentCategory("Mice", DataProducts().listMice))
            card_main.visibility = View.VISIBLE}
        card_tv.setOnClickListener{setFragment(FragmentCategory("Tv", DataProducts().listTv))
            card_main.visibility = View.VISIBLE}
        card_tablets.setOnClickListener{setFragment(FragmentCategory("Tablets", DataProducts().listTablets))
            card_main.visibility = View.VISIBLE}
    }

    private fun updateAdapterRec(){
        rec_hot.adapter = AdapterProduct(list_hot, R.layout.item_hit)
    }

    private fun setFragment(fragment: Fragment){
        val fr = childFragmentManager
        val tr = fr.beginTransaction()
        if (fr.fragments.size != 0) {
            tr.remove(fr.fragments[0])
        }
        tr.add(R.id.frame, fragment)
        tr.commit()
    }
}