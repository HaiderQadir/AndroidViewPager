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
    private var footerCardVisibility: Boolean,
    private var settingsIconVisibility: Boolean,
    private var infoIconVisibility: Boolean
) : Fragment() {

    private var mView: View? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null
    private var mInfoIcon: ImageView? = null
    private var mSettingsIcon: ImageView? = null
    private var mFooterCard: ConstraintLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.fragment_view_pager, container, false)

        mInit()

        val adapter = fragmentManager?.let { ViewPagerAdapter(it) }
        if (!footerCardVisibility) mFooterCard!!.visibility = View.GONE
        if (!settingsIconVisibility) mSettingsIcon!!.visibility = View.GONE
        if (!infoIconVisibility) mInfoIcon!!.visibility = View.GONE

        adapter!!.addFragment(
            VPItemFragment("Fragment_1_Title", "Fragment_1_Detail")
        )
        adapter!!.addFragment(
            VPItemFragment("Fragment_1_Title", "Fragment_1_Detail")
        )
        adapter!!.addFragment(
            VPItemFragment("Fragment_1_Title", "Fragment_1_Detail")
        )
        adapter!!.addFragment(
            VPItemFragment("Fragment_1_Title", "Fragment_1_Detail")
        )

        viewPager!!.adapter = adapter
        tabLayout!!.setupWithViewPager(viewPager, true)
        return mView;
    }

    private fun mInit() {
        mFooterCard = mView!!.findViewById(R.id.footer_card_CL)
        mSettingsIcon = mView!!.findViewById(R.id.iv_settings_card)
        mInfoIcon = mView!!.findViewById(R.id.iv_i_card)
        viewPager = mView!!.findViewById(R.id.view_pager)
        tabLayout = mView!!.findViewById(R.id.tab_layout)
    }

}