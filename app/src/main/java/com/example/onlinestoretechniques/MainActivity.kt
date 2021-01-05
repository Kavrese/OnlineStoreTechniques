package com.example.onlinestoretechniques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestoretechniques.model.ModelProduct
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var list_hot = mutableListOf(
        ModelProduct("Apple iPad Pro 2020", "Планшеты", "Apple", "$ 999,99", photos = arrayListOf("https://c.dns-shop.ru/thumb/st4/fit/500/500/b259a78af93c9ea56f154b1c57e99f4a/9f2601c960b6daf3bc40cb4f658e025d505258c87a16de24af17ad29076ae046.jpg")),
        ModelProduct("Apple MacBook Pro 16", "Ноутбуки", "Apple", "$ 3299,99", photos = arrayListOf("https://c.dns-shop.ru/thumb/st1/fit/200/200/0444ddec49e4031d2b9a836060da1c99/e1231968734c0a397f2e92eb5050ee8150d03ac7bc72256d3761a2ca59a28b4a.jpg"))
    )
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