package com.fila.catatan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

//Digunakan untuk Penghubung antara main_activity ke setiap fragment
class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 2

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return HomeFragment()}
            1 -> {return CatatanFragment()}
            else -> { return SaveFragment()
            }
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}