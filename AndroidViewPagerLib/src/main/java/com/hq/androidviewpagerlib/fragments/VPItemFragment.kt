package com.hq.androidviewpagerlib.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hq.androidviewpagerlib.R

/** @author HaiderQadir **/

class VPItemFragment(var mTitle: String,var mDetail:String) : Fragment() {
    private var mView: View? = null
    private var mTitleText: TextView? = null
    private var mDetailText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.fragment_vp_item, container, false)

        mTitleText = mView!!.findViewById<TextView>(R.id.vp_item_textview)
        mTitleText!!.text = mTitle

        mDetailText = mView!!.findViewById<TextView>(R.id.vp_item_textview)
        mDetailText!!.text = mDetail



        return mView;

    }

}