package com.kodiiiofc.urbanuniversity.internetslider.domain

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerBrowserFragmentAdapter(fragment: FragmentActivity, private val list: List<Page>) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = list.size

    override fun createFragment(position: Int): Fragment {
        val fragment = BrowserFragment()
        fragment.arguments = bundleOf("page" to list[position])
        return fragment
    }
}