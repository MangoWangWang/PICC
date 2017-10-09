package com.piccjm.picc.entity;

/**
 * Created by mangowangwang on 2017/10/9.
 */

public class Progress {
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    private String completedMonth; // 本月累计完成

    public String getCompletedMonth() {
        return completedMonth;
    }

    public void setCompletedMonth(String completedMonth) {
        this.completedMonth = completedMonth;
    }

    public String getCurrentPremium() {
        return currentPremium;
    }

    public void setCurrentPremium(String currentPremium) {
        this.currentPremium = currentPremium;
    }

    public String getContemporaneousPremium() {
        return contemporaneousPremium;
    }

    public void setContemporaneousPremium(String contemporaneousPremium) {
        this.contemporaneousPremium = contemporaneousPremium;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(String growthRate) {
        this.growthRate = growthRate;
    }

    private String currentPremium; // 本期保费
    private String contemporaneousPremium; //同期保费
    private String growthRate; // 增速

}
