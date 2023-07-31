package com.sizhangding.app.HomePage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sizhangding.app.R
import com.sizhangding.app.HomePage.Weather.WeatherActivity

class HomePageActivity : AppCompatActivity() {

    private var rootView: ConstraintLayout? = null


    /** RecycleView 的适配器 */
    private var adapter: HomePageAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage_view)
        rootView = findViewById(R.id.home_page_)


        // 添加RecycleView
        addRecycleView()


        findViewById<LinearLayout>(R.id.weather).setOnClickListener {
            startActivity(Intent(this@HomePageActivity, WeatherActivity::class.java))
        }


        // 设置 Button 的点击事件监听器
        findViewById<ImageButton>(R.id.add_some_news).setOnClickListener {
            Toast.makeText(this, "待完成添加新闻功能", Toast.LENGTH_SHORT).show()
        }
    }


    private fun addRecycleView() {
        var recycleView: RecyclerView? = null
        // 从布局中进行获取
        recycleView = findViewById(R.id.rv_demo)
        adapter = HomePageAdapter(createDemoDate())
        recycleView?.adapter = adapter
        recycleView?.layoutManager = LinearLayoutManager(this)

    }

    private fun createDemoDate(): ArrayList<HomePageItemBean> {

        val list = ArrayList<HomePageItemBean>()

        val firstItem = HomePageItemBean(R.drawable.ic_launcher_background, "我是标题11", "我是内容11")
        val secondItem =
            HomePageItemBean(R.drawable.ic_launcher_foreground, "我是标题22", "我是内容22我是内容22我是内容22我是内容22")

        for (i in 0 until 10) {
            list.add(firstItem)
            list.add(secondItem)
        }

        return list
    }

}