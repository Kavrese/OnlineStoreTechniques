package com.example.onlinestoretechniques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestoretechniques.model.ModelProduct
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.lin_category.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var list_hot = DataProducts().listPhones.toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lin_main.requestFocus()
        rec_hot.apply{
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        }
        updateAdapterRec()
        setFragment(FragmentRecommendation())
    }

    private fun updateAdapterRec(){
        rec_hot.adapter = AdapterProduct(list_hot, R.layout.item_hit)
    }

    private fun setFragment(fragment: Fragment){
        val fr = supportFragmentManager
        val tr = fr.beginTransaction()
        if (fr.fragments.size != 0) {
            tr.remove(fr.fragments[0])
        }
        tr.add(R.id.frame, fragment)
        tr.commit()
    }

    fun clickToCategory(v: View){
        var text = "Category"
        when (v.id){
            R.id.card_phones -> text = "Phones"
            R.id.card_cameras -> text = "Cameras"
            R.id.card_laptop -> text = "Laptops"
            R.id.card_head -> text = "Headphones"
            R.id.card_tv -> text = "Tv"
            R.id.card_keyboards -> text = "Keyboards"
            R.id.card_tablets -> text = "Tablets"
            R.id.card_mice -> text = "Mice"
            R.id.card_printers -> text = "Printers"
            R.id.card_watch -> text = "Watch"
        }
        setFragment(FragmentCategory(text, list_hot))
    }
}