package com.piccjm.picc.view;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;

import com.piccjm.picc.R;
import com.piccjm.picc.adapter.AdapterProg;
import com.piccjm.picc.entity.Progress;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mangowangwang on 2017/9/29.
 */

public class LayoutProgress extends Fragment {

    private View rootView;
    private Context mContext;
    private List<String> stringList = new ArrayList<>();

    private RecyclerView progressRecycleView;
    private List<Progress> progressList = new ArrayList<>();
    
    // 开始时间
    private int startYear = 2010;
    private int startMonth = 6;
    private int startDay = 15;

    // 结束时间
    private int endYear = 2011;
    private int endMonth = 6;
    private int endDay = 15;

    private Button startDateButton;
    private Button endDateButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_progress,container,false);
        initView();
        return rootView;
    }
    private void initView()
    {
        mContext = getContext();
        // 实例化控件
        AppCompatSpinner spinner_xz = (AppCompatSpinner) rootView.findViewById(R.id.pg_spinner_xianZhong);
        AppCompatSpinner spinner_qd = (AppCompatSpinner) rootView.findViewById(R.id.pg_spinner_quDao);
        AppCompatSpinner spinner_tk = (AppCompatSpinner) rootView.findViewById(R.id.pg_spinner_tiaoKuan);

         startDateButton = (Button) rootView.findViewById(R.id.pg_bt_start);
         endDateButton = (Button) rootView.findViewById(R.id.pg_bt_end);

        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getStartDate();
            }
        });
        endDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getEndDate();
            }
        });


        /**
         * 下拉菜单部分
         */
        // 创建数据源
        loadSpinnerData();
        // 创建适配器
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(mContext,android.R.layout.simple_spinner_item,stringList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 配置适配器
        spinner_qd.setAdapter(arrayAdapter);
        spinner_tk.setAdapter(arrayAdapter);
        spinner_xz.setAdapter(arrayAdapter);

        /**
         * recycleView部分
         */

        // 1.实例化控件
        progressRecycleView = (RecyclerView) rootView.findViewById(R.id.pg_rv_progress);
        // 2.创建数据源
        loadItemData();
        // 3.创建适配器
        AdapterProg adapterProg = new AdapterProg(mContext,progressList);
        // 设置适配器和布局
        progressRecycleView.setLayoutManager(new LinearLayoutManager(mContext));
        progressRecycleView.setAdapter(adapterProg);
        progressRecycleView.setItemAnimator(new DefaultItemAnimator());



    }

    private void loadSpinnerData()
    {
        stringList.clear();
        String string[] = {"汽车险","商业险","交强险","摩托车"};
        for (String tempString :string) {
            stringList.add(tempString);
        }
    }

    private void loadItemData()
    {

        progressList.clear();
        Progress progress = new Progress();
        progress.setDepartment("车商二部: 4407001");
        progress.setCompletedMonth("9,020,824.00");
        progress.setCurrentPremium("8,218,327.00");
        progress.setContemporaneousPremium("8,436,480.00");
        progress.setGrowthRate("-2.59%");
        for (int i = 0; i < 10; i++) {
            progressList.add(progress);
        }
    }

    public void getStartDate() {

        new DatePickerDialog(mContext, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                startYear = year;
                startMonth = monthOfYear;
                startDay = dayOfMonth;
                showDate(startDateButton);
            }
        }, startYear, startMonth, startDay).show();

    }

    public void getEndDate() {

        new DatePickerDialog(mContext, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                endYear = year;
                endMonth = monthOfYear;
                endDay = dayOfMonth;
                showDate(endDateButton);
            }
        }, endYear, endMonth, endDay).show();

    }

    // 显示选择日期
    private void showDate(Button button) {

        if (button.getId() == R.id.pg_bt_start)
        {
            button.setText( startYear + "-" + (startMonth+1) + "-" + startDay);
        }else
        {
            button.setText( endYear + "-" + (endMonth+1) + "-" + endDay);
        }
        
    }



}
