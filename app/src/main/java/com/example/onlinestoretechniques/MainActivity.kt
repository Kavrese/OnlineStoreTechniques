package com.example.onlinestoretechniques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestoretechniques.model.ModelProduct
import kotlinx.android.synthetic.main.activity_main.*

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
        tr.add(R.id.frame, fragment)
        tr.commit()
    }
}