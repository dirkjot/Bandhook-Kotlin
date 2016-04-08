package com.antonioleiva.bandhookkotlin.ui.screens.tabs

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.antonioleiva.bandhookkotlin.R

open class TabFragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.tab_fragment_2, container, false)
        return view
    }

    open fun sillyFun() : String {
        return "Hello Silly"
    }

    fun goInner(): String {
        val inner = InnerClass(this)
        val res = inner.moreSilly()
        return res
    }
}

class InnerClass constructor (val fragment: TabFragment2) {

    fun moreSilly() : String {
        val res = fragment.sillyFun()
        return res
    }

}