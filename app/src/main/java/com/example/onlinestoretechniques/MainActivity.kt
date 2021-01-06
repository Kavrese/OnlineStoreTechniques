package com.example.onlinestoretechniques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        updateAdapterRec(rec_hot, AdapterProduct(list_hot, R.layout.item_hit))
    }

    private fun updateAdapterRec(rec: RecyclerView, adapter: AdapterProduct){
        rec.adapter = adapter
    }
}