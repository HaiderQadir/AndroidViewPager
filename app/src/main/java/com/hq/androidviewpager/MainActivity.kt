package com.hq.androidviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hq.androidviewpagerlib.fragments.ViewPagerFragment

/** @author Haider Qadir **/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mFragment = ViewPagerFragment(
            false,
            settingsIconVisibility = false,
            infoIconVisibility = false
        )
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, mFragment).commit()

    }
}