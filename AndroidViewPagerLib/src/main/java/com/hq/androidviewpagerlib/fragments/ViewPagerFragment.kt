package com.hq.androidviewpagerlib.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.hq.androidviewpagerlib.R
import com.hq.androidviewpagerlib.adapters.ViewPagerAdapter

/** @author HaiderQadir **/

class ViewPagerFragment(
    var footerCardVisibility: Boolean,
    var settingsIconVisibility: Boolean,
    var infoIconVisibility: Boolean
) : Fragment() {

    private var mView: View? = null
    private var mFooterCard: ConstraintLayout? = null
    private var mSettingsIcon: ImageView? = null
    private var mInfoIcon: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.fragment_view_pager, container, false)
        val adapter = fragmentManager?.let { ViewPagerAdapter(it) }

        mFooterCard = mView!!.findViewById(R.id.footer_card_CL)
        mSettingsIcon = mView!!.findViewById(R.id.iv_settings_card)
        mInfoIcon = mView!!.findViewById(R.id.iv_i_card)

        if (!footerCardVisibility) mFooterCard!!.visibility = View.GONE
        if (!settingsIconVisibility) mSettingsIcon!!.visibility = View.GONE
        if (!infoIconVisibility) mInfoIcon!!.visibility = View.GONE

        adapter!!.addFragment(
            VPItemFragment("Fragment_1")
        )
        adapter!!.addFragment(
            VPItemFragment("Fragment_2")
        )
        adapter!!.addFragment(
            VPItemFragment("Fragment_3")
        )
        adapter!!.addFragment(
            VPItemFragment("Fragment_4")
        )
        var viewPager: ViewPager? = null
        var tabLayout: TabLayout? = null
        viewPager = mView!!.findViewById(R.id.view_pager)
        tabLayout = mView!!.findViewById(R.id.tab_layout)

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager, true)
        return mView;
    }

}