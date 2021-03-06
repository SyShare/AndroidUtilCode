package com.blankj.utilcode.pkg.feature.adaptScreen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.blankj.lib.base.BaseBackActivity
import com.blankj.utilcode.pkg.R
import kotlinx.android.synthetic.main.activity_adaptscreen.*

class AdaptScreenActivity : BaseBackActivity() {

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, AdaptScreenActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun initData(bundle: Bundle?) {}

    override fun bindLayout(): Int {
        return R.layout.activity_adaptscreen;
    }

    override fun initView(savedInstanceState: Bundle?, contentView: View) {
        adaptScreenAdaptWidthBtn.setOnClickListener { WidthActivity.start(this) }
        adaptScreenAdaptHeightBtn.setOnClickListener { HeightActivity.start(this) }
        adaptScreenCloseAdaptBtn.setOnClickListener { CloseAdaptActivity.start(this) }
    }

    override fun doBusiness() {}

    override fun onWidgetClick(view: View) {}
}
