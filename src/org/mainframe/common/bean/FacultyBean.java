package org.mainframe.common.bean;

import java.io.Serializable;

public class FacultyBean implements Serializable {

	private String firstName = null;
	private String lastName = null;
        private String gradSchool = null;
        private String degree = null;
        private String title = null;
        private String daysToTeach = null;
        private Double maxLoadFall = null;
        private Double maxLoadSpring = null;
        private Double maxLoadSummer = null;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGradSchool() {
        return gradSchool;
    }

    public void setGradSchool(String gradSchool) {
        this.gradSchool = gradSchool;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDaysToTeach() {
        return daysToTeach;
    }

    public void setDaysToTeach(String daysToTeach) {
        this.daysToTeach = daysToTeach;
    }

    public Double getMaxLoadFall() {
        return maxLoadFall;
    }

    public void setMaxLoadFall(Double maxLoadFall) {
        this.maxLoadFall = maxLoadFall;
    }

    public Double getMaxLoadSpring() {
        return maxLoadSpring;
    }

    public void setMaxLoadSpring(Double maxLoadSpring) {
        this.maxLoadSpring = maxLoadSpring;
    }

    public Double getMaxLoadSummer() {
        return maxLoadSummer;
    }

    public void setMaxLoadSummer(Double maxLoadSummer) {
        this.maxLoadSummer = maxLoadSummer;
    }

      
   
	
}
