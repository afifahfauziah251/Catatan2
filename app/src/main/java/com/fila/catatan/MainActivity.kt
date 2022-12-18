package com.fila.catatan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

//Menampilkan icon untuk TabLayout dan untuk membuat ViewPagernya dapat berjalan

class MainActivity : AppCompatActivity() {

    val menuTeks = arrayOf("Note","Save")
    val menuIcon = arrayOf(R.drawable.ic_note, R.drawable.ic_save)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{ tap, position ->
                tap.text = menuTeks[position]
                tap.icon = ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }
}

