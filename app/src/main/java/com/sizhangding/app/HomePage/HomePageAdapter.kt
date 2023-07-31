package com.sizhangding.app.HomePage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sizhangding.app.R


class HomePageAdapter : RecyclerView.Adapter<HomePageViewHolder> {

    /** 保存数据的列表 */
    private val demoList: List<HomePageItemBean>

    constructor(demoList: List<HomePageItemBean>) {
        this.demoList = demoList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePageViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.homepage_view_item, parent, false)
        return HomePageViewHolder(view)
    }


    override fun onBindViewHolder(holder: HomePageViewHolder, position: Int) {
        val itemBean = demoList[position]

        itemBean.coverUrl?.let {
            holder.ivCover?.setImageResource(it)
        }

        itemBean.title?.let {
            holder.tvTitle.text = it
        }

        itemBean.content?.let {
            holder.tvContent.text = it
        }
    }


    override fun getItemCount(): Int {
        return demoList.size
    }
}