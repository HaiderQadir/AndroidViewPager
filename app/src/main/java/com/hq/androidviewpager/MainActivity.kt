package com.hq.androidviewpager

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.hq.androidviewpagerlib.fragments.ViewPagerFragment

/** @author HaiderQadir **/

class MainActivity : AppCompatActivity() {

    private var mFrameLayout: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFrameLayout = findViewById<FrameLayout>(R.id.frameLayout)
        val mFragment = ViewPagerFragment(
            false,
            settingsIconVisibility = false,
            infoIconVisibility = false
        )
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, mFragment).commit()
    }
}