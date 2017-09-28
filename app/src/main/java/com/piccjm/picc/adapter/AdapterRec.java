package com.piccjm.picc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.piccjm.picc.R;
import com.piccjm.picc.entity.Recommend;

import java.util.List;

/**
 * Created by mangowangwang on 2017/9/28.
 */

public class AdapterRec extends RecyclerView.Adapter<AdapterRec.ViewHolder> {


    private Context mContext;

    private List<Recommend> recommends; // 推荐数据列表

    class ViewHolder extends RecyclerView.ViewHolder
    {

        private TextView tv_type;
        private TextView tv_location;

        private TextView tv_recommend_one;
        private TextView tv_recommend_two;
        private TextView tv_recommend_three;
        private TextView tv_recommend_four;
        private TextView tv_recommend_five;

        private TextView tv_samePeriod_money;
        private TextView tv_samePeriod_number;
        private TextView tv_renewal_money;
        private TextView tv_renewal_number;
        private TextView tv_number_percent;


        public ViewHolder(View itemView) {
            super(itemView);
            tv_type = (TextView) itemView.findViewById(R.id.re_tv_type);
            tv_location = (TextView) itemView.findViewById(R.id.re_tv_location);
            tv_recommend_one = (TextView) itemView.findViewById(R.id.re_tv_reType1);
            tv_recommend_two = (TextView) itemView.findViewById(R.id.re_tv_reType2);
            tv_recommend_three = (TextView) itemView.findViewById(R.id.re_tv_reType3);
            tv_recommend_four = (TextView) itemView.findViewById(R.id.re_tv_reType4);
            tv_recommend_five = (TextView) itemView.findViewById(R.id.re_tv_reType5);
            tv_samePeriod_money = (TextView) itemView.findViewById(R.id.re_tv_sp_money);
            tv_samePeriod_number = (TextView) itemView.findViewById(R.id.re_tv_sp_number);
            tv_renewal_money = (TextView) itemView.findViewById(R.id.re_tv_rw_money);
            tv_renewal_number= (TextView) itemView.findViewById(R.id.re_tv_rw_number);
            tv_number_percent = (TextView) itemView.findViewById(R.id.re_tv_nb_percent);
        }
    }


    public AdapterRec(Context context,List<Recommend> recommends)
    {
        this.mContext = context;
        this.recommends = recommends;
    }


    // 创建itemView
    @Override
    public AdapterRec.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_recommend,parent,false));
    }

    // 绑定数据
    @Override
    public void onBindViewHolder(AdapterRec.ViewHolder holder, int position) {
        // 取出数据
        Recommend recommend = recommends.get(position);

        // 绑定数据
        holder.tv_type.setText(recommend.getType());
        holder.tv_location.setText(recommend.getLocation());

        holder.tv_recommend_one.setText(recommend.getRecommend_one());
        holder.tv_recommend_two.setText(recommend.getRecommend_two());
        holder.tv_recommend_three.setText(recommend.getRecommend_three());
        holder.tv_recommend_four.setText(recommend.getRecommend_four());
        holder.tv_recommend_five.setText(recommend.getRecommend_five());

        holder.tv_samePeriod_money.setText(recommend.getSamePeriod_money());
        holder.tv_samePeriod_number.setText(recommend.getSamePeriod_number());
        holder.tv_renewal_money.setText(recommend.getRenewal_money());
        holder.tv_renewal_number.setText(recommend.getRenewal_number());

        holder.tv_number_percent.setText(recommend.getNumber_percent());

    }

    @Override
    public int getItemCount() {
        return (recommends == null ? 0 : recommends.size());
    }
}
