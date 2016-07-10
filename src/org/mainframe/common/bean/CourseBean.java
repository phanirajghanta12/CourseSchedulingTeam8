package org.mainframe.common.bean;

import java.io.Serializable;

public class CourseBean implements Serializable {

	private String courseCode = null;
	private String courseName = null;
        private String courseDesc = null;
        private Double courseHours = null;
        private Double courseCap = null;
        private String offeredFall = null;
        private String offeredSpring = null;
        private String offeredSummer = null;
        private String coursePreReq = null;
        private String teacher = null;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public Double getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(Double courseHours) {
        this.courseHours = courseHours;
    }

    public Double getCourseCap() {
        return courseCap;
    }

    public void setCourseCap(Double courseCap) {
        this.courseCap = courseCap;
    }

    public String getOfferedFall() {
        return offeredFall;
    }

    public void setOfferedFall(String offeredFall) {
        this.offeredFall = offeredFall;
    }

    public String getOfferedSpring() {
        return offeredSpring;
    }

    public void setOfferedSpring(String offeredSpring) {
        this.offeredSpring = offeredSpring;
    }

    public String getOfferedSummer() {
        return offeredSummer;
    }

    public void setOfferedSummer(String offeredSummer) {
        this.offeredSummer = offeredSummer;
    }

    public String getCoursePreReq() {
        return coursePreReq;
    }

    public void setCoursePreReq(String coursePreReq) {
        this.coursePreReq = coursePreReq;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    
}
