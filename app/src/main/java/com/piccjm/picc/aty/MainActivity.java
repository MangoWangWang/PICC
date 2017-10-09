package com.piccjm.picc.aty;

import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.piccjm.picc.R;
import com.piccjm.picc.adapter.AdapterMainViewPager;
import com.piccjm.picc.view.LayoutProgress;
import com.piccjm.picc.view.LayoutRecommend;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tableLayout;
    private List<TabLayout.Tab> tabList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView()
    {
        // 实例化控件
        viewPager = (ViewPager) findViewById(R.id.main_viewPager);
        tableLayout = (TabLayout) findViewById(R.id.main_tabLayout);

        // 创建viewPager适配器
        AdapterMainViewPager adapterMainViewPager = new AdapterMainViewPager(getSupportFragmentManager());
        adapterMainViewPager.addFragment(new LayoutRecommend());
        adapterMainViewPager.addFragment(new LayoutProgress());
        adapterMainViewPager.addFragment(new LayoutRecommend());
        adapterMainViewPager.addFragment(new LayoutRecommend());

        // 绑定适配器
        viewPager.setAdapter(adapterMainViewPager);

        // 将ViewPager与tablayout绑定
        tableLayout.setupWithViewPager(viewPager);

        // 取出tablayout中的tab标签集合
        tabList.add(tableLayout.getTabAt(0));
        tabList.add(tableLayout.getTabAt(1));
        tabList.add(tableLayout.getTabAt(2));
        tabList.add(tableLayout.getTabAt(3));

        // 修改其中的属性
        tabList.get(0).setText("推荐");
        tabList.get(1).setText("进度");
        tabList.get(2).setText("续保");
        tabList.get(3).setText("我");


    }
}
