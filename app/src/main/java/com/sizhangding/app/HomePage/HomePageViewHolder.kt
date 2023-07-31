package com.sizhangding.app.HomePage

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sizhangding.app.R


class HomePageViewHolder : RecyclerView.ViewHolder {

    /** 封面图 */
    var ivCover: ImageView
        private set
    /** 标题 */
    var tvTitle:TextView
        private set
    /** 内容 */
    var tvContent: TextView
        private set


    constructor(view: View) : super(view) {
        ivCover = view.findViewById(R.id.cover)
        tvTitle = view.findViewById(R.id.tv_title)
        tvContent = view.findViewById(R.id.tv_content)
    }
}