package com.antonioleiva.bandhookkotlin.ui.screens.tabs

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.text.Html
import android.widget.TextView
import com.antonioleiva.bandhookkotlin.R
import com.antonioleiva.bandhookkotlin.di.Inject
import com.antonioleiva.bandhookkotlin.di.Injector
import com.antonioleiva.bandhookkotlin.ui.activity.BaseActivity
import com.antonioleiva.bandhookkotlin.ui.adapter.PagerAdapter
import com.antonioleiva.bandhookkotlin.ui.entity.ArtistDetail
import com.antonioleiva.bandhookkotlin.ui.entity.mapper.ArtistDetailDataMapper
import com.antonioleiva.bandhookkotlin.ui.presenter.DetailPresenter
import com.antonioleiva.bandhookkotlin.ui.util.getNavigationId
import com.antonioleiva.bandhookkotlin.ui.view.DetailView
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

        val tabLayout = findViewById(R.id.tab_layout) as TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("T1"))
        tabLayout.addTab(tabLayout.newTab().setText("T2"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val viewPager = findViewById(R.id.pager) as ViewPager
        val adapter = PagerAdapter(supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {       }

            override fun onTabReselected(tab: TabLayout.Tab) {     }
        })
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