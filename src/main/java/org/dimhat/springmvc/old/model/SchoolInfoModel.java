package org.dimhat.springmvc.old.model;

/**
 * TODO
 * @author dimhat@qq.com
 * @date 2015年12月10日 下午11:12:31
 */
public class SchoolInfoModel {
    private String schoolType; //学校类型：高中、中专、大学  
    private String schoolName; //学校名称  
    private String specialty; //专业  

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

}
