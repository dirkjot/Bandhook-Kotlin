package com.antonioleiva.bandhookkotlin.ui.screens.tabs

import android.os.Bundle
import android.text.Html
import android.widget.ImageView
import android.widget.TextView
import com.antonioleiva.bandhookkotlin.R
import com.antonioleiva.bandhookkotlin.di.Inject
import com.antonioleiva.bandhookkotlin.di.Injector
import com.antonioleiva.bandhookkotlin.ui.activity.BaseActivity
import com.antonioleiva.bandhookkotlin.ui.entity.ArtistDetail
import com.antonioleiva.bandhookkotlin.ui.entity.mapper.ArtistDetailDataMapper
import com.antonioleiva.bandhookkotlin.ui.presenter.DetailPresenter
import com.antonioleiva.bandhookkotlin.ui.util.getNavigationId
import com.antonioleiva.bandhookkotlin.ui.util.supportsLollipop
import com.antonioleiva.bandhookkotlin.ui.view.DetailView
import com.antonioleiva.bandhookkotlin.ui.view.TabView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import org.jetbrains.anko.find

class TabActivity : BaseActivity(), DetailView, Injector by Inject.instance {

    override val layoutResource: Int = R.layout.tab_detail

    val presenter = DetailPresenter(this, bus, artistDetailInteractorProvider,
            interactorExecutor, ArtistDetailDataMapper())

    val name by lazy { find<TextView>(R.id.name) }
    val biography by lazy { find<TextView>(R.id.biography) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        supportPostponeEnterTransition()
        title = null

        supportActionBar?.setDisplayHomeAsUpEnabled(true)  // enable back icon and clickable toolbar

    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
        presenter.init(getNavigationId())
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun showArtist(artistDetail: ArtistDetail) {
        name.text = artistDetail.name
        biography.text = Html.fromHtml(artistDetail.bio)

//        supportStartPostponedEnterTransition()
    }
}