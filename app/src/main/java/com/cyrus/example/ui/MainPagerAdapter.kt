package com.cyrus.example.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cyrus.example.ui.tabs.CryptoFragment
import com.cyrus.example.ui.tabs.NativeFragment
import com.cyrus.example.ui.tabs.NetworkFragment
import com.cyrus.example.ui.tabs.SecurityFragment

class MainPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    private val fragments: List<Fragment> = listOf(
        SecurityFragment(),
        NativeFragment(),
        CryptoFragment(),
        NetworkFragment()
    )

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}


