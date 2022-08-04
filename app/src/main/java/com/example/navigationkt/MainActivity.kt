package com.example.navigationkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_navi.setOnClickListener{
            layout_drawer.openDrawer(GravityCompat.START)
        }
        naviView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {   //네비게이션 메뉴 클릭 시 수행
        when(item.itemId){
            R.id.home -> Toast.makeText(applicationContext,"홈버튼",Toast.LENGTH_SHORT).show()
            R.id.live -> Toast.makeText(applicationContext,"라이브",Toast.LENGTH_SHORT).show()
            R.id.online -> Toast.makeText(applicationContext,"온라인",Toast.LENGTH_SHORT).show()
            R.id.how -> Toast.makeText(applicationContext,"경매 방법",Toast.LENGTH_SHORT).show()
            R.id.company -> Toast.makeText(applicationContext,"회사 소개",Toast.LENGTH_SHORT).show()
        }
        layout_drawer.closeDrawers()

        return false
    }

    override fun onBackPressed() {
        if(layout_drawer.isDrawerOpen(GravityCompat.START))
        {
            layout_drawer.closeDrawers()
        }
        else
        {
            super.onBackPressed()
        }

    }
}