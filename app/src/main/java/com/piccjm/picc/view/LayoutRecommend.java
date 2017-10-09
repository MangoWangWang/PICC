package com.piccjm.picc.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piccjm.picc.R;
import com.piccjm.picc.adapter.AdapterRec;
import com.piccjm.picc.entity.Recommend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mangowangwang on 2017/9/28.
 */

public class LayoutRecommend extends Fragment {

    private Context mContext;
    private View rootView ;
    private RecyclerView recyclerView;
    private List<Recommend> recommendList  = new ArrayList<>();
    private AdapterRec adapterRec;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_recommend,container,false);
        initView();
        return rootView;
    }

    private void initView() {
        mContext = getContext();

        recyclerView = rootView.findViewById(R.id.recommend_recyclerView);
        // 1.创建数据源
        lodeDate();
        // 2.创建适配器
        adapterRec = new AdapterRec(mContext,recommendList);
        // 3.配置适配器与布局manager
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(adapterRec);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void lodeDate() {
        for (int i = 0; i < 5; i++)
        {

            Recommend recommend = new Recommend();
            recommend.setLocation("五邑大学");
            recommend.setType("实习");
            recommend.setRecommend_one("帅哥");
            recommend.setRecommend_two("美女");
            recommend.setRecommend_three("1.8米");
            recommend.setRecommend_four("土豪");
            recommend.setRecommend_five("屌丝");
            recommend.setSamePeriod_money("12345678");
            recommend.setSamePeriod_number("12345678" );
            recommend.setRenewal_money("12345678");
            recommend.setRenewal_number("12345678");
            recommend.setNumber_percent("44%");
            recommendList.add(recommend);
        }
    }


}
