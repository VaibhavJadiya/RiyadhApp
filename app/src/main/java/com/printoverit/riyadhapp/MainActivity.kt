package com.printoverit.riyadhapp

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val spaces=23
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coachSubTabLay.addTab(coachSubTabLay.newTab().setText(resources.getText(R.string.all)))
        coachSubTabLay.addTab(coachSubTabLay.newTab().setText(resources.getText(R.string.magic)))
        coachSubTabLay.addTab(coachSubTabLay.newTab().setText(resources.getText(R.string.technology)))
        coachSubTabLay.addTab(coachSubTabLay.newTab().setText(resources.getText(R.string.magic)))
        coachSubTabLay.addTab(coachSubTabLay.newTab().setText(resources.getText(R.string.games)))
        coachSubTabLay.addTab(coachSubTabLay.newTab().setText(resources.getText(R.string.history)))
        coachSubTabLay.tabGravity = TabLayout.GRAVITY_FILL

        val tabs = coachSubTabLay.getChildAt(0) as ViewGroup
        for (i in 0 until tabs.childCount - 1) {
            val v: View = tabs.getChildAt(i)
            val params = v.layoutParams as MarginLayoutParams
            params.rightMargin = spaces
        }
    }
}