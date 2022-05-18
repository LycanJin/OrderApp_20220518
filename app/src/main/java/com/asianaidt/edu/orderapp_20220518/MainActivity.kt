package com.asianaidt.edu.orderapp_20220518

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.edu.orderapp_20220518.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = mvpa

        tab_layout.setupWithViewPager(viewPager)
    }
}