package com.antonioleiva.bandhookkotlin.ui.view

import com.antonioleiva.bandhookkotlin.ui.entity.ArtistDetail

// TODO can we please remove this file??? DPJ


interface TabView : PresentationView {
    fun showArtist(artistDetail: ArtistDetail)
}