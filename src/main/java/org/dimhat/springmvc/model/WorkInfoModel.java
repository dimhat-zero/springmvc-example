package org.dimhat.springmvc.model;

/**
 * TODO
 * @author dimhat@qq.com
 * @date 2015年12月10日 下午11:12:58
 */
public class WorkInfoModel {
    private String city; //所在城市  
    private String job; //职位  
    private String year; //工作年限 

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
