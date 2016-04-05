package com.antonioleiva.bandhookkotlin.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

import com.antonioleiva.bandhookkotlin.ui.screens.tabs.BiographyFragment
import com.antonioleiva.bandhookkotlin.ui.screens.tabs.TabFragment2

class PagerAdapter(fm: FragmentManager, internal var mNumOfTabs: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> {
                val tab1 = BiographyFragment()
                return tab1
            }
            1 -> {
                val tab2 = TabFragment2()
                return tab2
            }
            else -> return null
        }
    }

    override fun getCount(): Int {
        return mNumOfTabs
    }
}