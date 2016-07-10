package org.mainframe.common.bean;

import java.io.Serializable;

public class DegreePlanBean implements Serializable {

	private String degreeCode = null;
	private String deptTrack = null;
        private String description = null;
        private Double hoursReq = null;
        private String type = null;
        private String courses = null;
        private String gradSchool = null;
        private Double forecast = null;

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public String getDeptTrack() {
        return deptTrack;
    }

    public void setDeptTrack(String deptTrack) {
        this.deptTrack = deptTrack;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getGradSchool() {
        return gradSchool;
    }

    public void setGradSchool(String gradSchool) {
        this.gradSchool = gradSchool;
    }

    public Double getHoursReq() {
        return hoursReq;
    }

    public void setHoursReq(Double hoursReq) {
        this.hoursReq = hoursReq;
    }

    public Double getForecast() {
        return forecast;
    }

    public void setForecast(Double forecast) {
        this.forecast = forecast;
    }

   

    
}
