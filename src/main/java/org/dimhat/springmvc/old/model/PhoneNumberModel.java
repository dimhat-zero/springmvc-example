package org.dimhat.springmvc.old.model;

/**
 * TODO
 * @author dimhat@qq.com
 * @date 2015年12月10日 下午11:13:55
 */
public class PhoneNumberModel {
    private String areaCode;    //区号  
    private String phoneNumber; //电话号码  

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
