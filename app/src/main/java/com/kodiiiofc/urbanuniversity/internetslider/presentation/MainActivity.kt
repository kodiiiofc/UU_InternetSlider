package com.kodiiiofc.urbanuniversity.internetslider.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.kodiiiofc.urbanuniversity.internetslider.R
import com.kodiiiofc.urbanuniversity.internetslider.domain.Page
import com.kodiiiofc.urbanuniversity.internetslider.domain.ViewPagerBrowserFragmentAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var browserVP: ViewPager2
    private lateinit var tabsTL: TabLayout
    private val internetPages = listOf(
        Page(title = "Поиск", url = "https://ya.ru", icon = R.drawable.ya),
        Page(title = "Новости", url = "https://meduza.io/", icon = R.drawable.meduza),
        Page(title = "Музыка", url = "https://open.spotify.com/", icon = R.drawable.spotify),
        Page(title = "Видео", url = "https://www.youtube.com/", icon = R.drawable.youtube),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        browserVP = findViewById(R.id.vp_browser)
        tabsTL = findViewById(R.id.tl_tabs)
        val adapter = ViewPagerBrowserFragmentAdapter(this, internetPages)
        browserVP.adapter = adapter
        TabLayoutMediator(tabsTL, browserVP) {tab, position ->
            val currentPage = internetPages[position]
            tab.text = currentPage.title
            tab.icon = resources.getDrawable(currentPage.icon)
        }.attach()
    }
}