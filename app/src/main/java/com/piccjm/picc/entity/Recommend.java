package com.piccjm.picc.entity;

import android.widget.TextView;

/**
 * Created by mangowangwang on 2017/9/28.
 */

public class Recommend {

    private String type; // 保险类型

    private String location; // 保险所在地
    // 保险种类的建议
    private String recommend_one;
    private String recommend_two;
    private String recommend_three;
    private String recommend_four;
    private String recommend_five;

    private String samePeriod_money; // 同期金额
    private String samePeriod_number; // 同期数目
    private String renewal_money; // 续保金额
    private String renewal_number; // 续保数目
    private String number_percent;  // 数量比例

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRecommend_one() {
        return recommend_one;
    }

    public void setRecommend_one(String recommend_one) {
        this.recommend_one = recommend_one;
    }

    public String getRecommend_two() {
        return recommend_two;
    }

    public void setRecommend_two(String recommend_two) {
        this.recommend_two = recommend_two;
    }

    public String getRecommend_three() {
        return recommend_three;
    }

    public void setRecommend_three(String recommend_three) {
        this.recommend_three = recommend_three;
    }

    public String getRecommend_four() {
        return recommend_four;
    }

    public void setRecommend_four(String recommend_four) {
        this.recommend_four = recommend_four;
    }

    public String getRecommend_five() {
        return recommend_five;
    }

    public void setRecommend_five(String recommend_five) {
        this.recommend_five = recommend_five;
    }

    public String getSamePeriod_money() {
        return samePeriod_money;
    }

    public void setSamePeriod_money(String samePeriod_money) {
        this.samePeriod_money = samePeriod_money;
    }

    public String getSamePeriod_number() {
        return samePeriod_number;
    }

    public void setSamePeriod_number(String samePeriod_number) {
        this.samePeriod_number = samePeriod_number;
    }

    public String getRenewal_money() {
        return renewal_money;
    }

    public void setRenewal_money(String renewal_money) {
        this.renewal_money = renewal_money;
    }

    public String getRenewal_number() {
        return renewal_number;
    }

    public void setRenewal_number(String renewal_number) {
        this.renewal_number = renewal_number;
    }

    public String getNumber_percent() {
        return number_percent;
    }

    public void setNumber_percent(String number_percent) {
        this.number_percent = number_percent;
    }




}
