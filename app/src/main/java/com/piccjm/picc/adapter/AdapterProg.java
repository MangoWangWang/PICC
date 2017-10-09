package com.piccjm.picc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.piccjm.picc.R;
import com.piccjm.picc.entity.Progress;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by mangowangwang on 2017/10/9.
 */

public class AdapterProg extends RecyclerView.Adapter<AdapterProg.ViewHolder> {

    private Context mContext;
    private List<Progress> progressList;

    public AdapterProg(Context context, List<Progress> progressList)
    {
        mContext = context;
        this.progressList = progressList;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_department; // 部门
        private TextView tv_completedMonth; // 本月累计完成
        private TextView tv_currentPremium; // 本期保费
        private TextView tv_contemporaneousPremium; // 同期保费
        private TextView tv_growthRate; // 增速
        public ViewHolder(View itemView) {
            super(itemView);
            tv_department = (TextView) itemView.findViewById(R.id.pg_tv_department);
            tv_completedMonth = (TextView) itemView.findViewById(R.id.pg_tv_completedMonth);
            tv_currentPremium = (TextView) itemView.findViewById(R.id.pg_tv_currentPremium);
            tv_contemporaneousPremium = (TextView) itemView.findViewById(R.id.pg_tv_contemporaneousPremium);
            tv_growthRate = (TextView) itemView.findViewById(R.id.pg_tv_growthRate);

        }
    }


    @Override
    public AdapterProg.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AdapterProg.ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_progress,parent,false));
    }

    @Override
    public void onBindViewHolder(AdapterProg.ViewHolder holder, int position) {

        Progress progress = progressList.get(position);
        holder.tv_department.setText(progress.getDepartment());
        holder.tv_completedMonth.setText(progress.getCompletedMonth());
        holder.tv_contemporaneousPremium.setText(progress.getContemporaneousPremium());
        holder.tv_growthRate.setText(progress.getGrowthRate());
        holder.tv_currentPremium.setText(progress.getCurrentPremium());
    }

    @Override
    public int getItemCount() {
         return (progressList == null ? 0 : progressList.size());
    }
}
