package com.antonioleiva.bandhookkotlin.ui.screens.tabs

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.antonioleiva.bandhookkotlin.R
import com.antonioleiva.bandhookkotlin.ui.entity.ArtistDetail
import org.jetbrains.anko.find
import org.jetbrains.anko.support.v4.find

class BiographyFragment : Fragment() {
    var artistDetail : ArtistDetail? = null
    val biography by lazy { find<TextView>(R.id.biography) }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.biography_fragment, container, false)
    }

    fun showArtist(artistDetail : ArtistDetail) {
        this.artistDetail = artistDetail
        biography.text = Html.fromHtml(artistDetail.bio)
        println("settting artist detail on bio frag " + biography.text.substring(0, 25))
    }
}
