package com.example.onlinestoretechniques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment(FragmentMain())
    }

    private fun setFragment(fragment: Fragment){
        val fr = supportFragmentManager
        val tr = fr.beginTransaction()
        if (fr.fragments.size != 0) {
            tr.remove(fr.fragments[0])
        }
        tr.add(R.id.frame_main, fragment)
        tr.commit()
    }
}