package com.antonioleiva.bandhookkotlin.ui.screens.tabs

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.text.Html
import android.widget.ImageView
import android.widget.TextView
import com.antonioleiva.bandhookkotlin.R
import com.antonioleiva.bandhookkotlin.di.Inject
import com.antonioleiva.bandhookkotlin.di.Injector
import com.antonioleiva.bandhookkotlin.ui.activity.BaseActivity
import com.antonioleiva.bandhookkotlin.ui.activity.ScrollableHeaderActivity
import com.antonioleiva.bandhookkotlin.ui.adapter.PagerAdapter
import com.antonioleiva.bandhookkotlin.ui.entity.ArtistDetail
import com.antonioleiva.bandhookkotlin.ui.entity.mapper.ArtistDetailDataMapper
import com.antonioleiva.bandhookkotlin.ui.presenter.DetailPresenter
import com.antonioleiva.bandhookkotlin.ui.util.getNavigationId
import com.antonioleiva.bandhookkotlin.ui.view.DetailView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import org.jetbrains.anko.find

class TabActivity : BaseActivity(), DetailView, ScrollableHeaderActivity,
        Injector by Inject.instance {

    override val activity: BaseActivity = this
    override val layoutResource: Int = R.layout.tab_detail

    val presenter = DetailPresenter(this, bus, artistDetailInteractorProvider,
            interactorExecutor, ArtistDetailDataMapper())

    val image by lazy { find<ImageView>(R.id.image) }
    val name by lazy { find<TextView>(R.id.name) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("oncreate tabactivity")
        supportPostponeEnterTransition()
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
                println("actually made the change , tab to ${tab.position}");
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {       }

            override fun onTabReselected(tab: TabLayout.Tab) {     }
        })
    }




    override fun onResume() {
        super.onResume()
        println("onresume tabactivity")
        presenter.onResume()
        presenter.init(getNavigationId())
    }

    override fun onPause() {
        super.onPause()
        println("onpause tabactivity")
        presenter.onPause()
    }

    override fun showArtist(artistDetail: ArtistDetail) {
        name.text = artistDetail.name
        val fragment : BiographyFragment = supportFragmentManager.fragments[0] as BiographyFragment
        fragment.showArtist(artistDetail)

        Picasso.with(this).load(artistDetail.url).fit().centerCrop().into(image, object : Callback.EmptyCallback() {
            override fun onSuccess() {
                initScrollableHeader()
                supportStartPostponedEnterTransition()
            }
        })
    }
}