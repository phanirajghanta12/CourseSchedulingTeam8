package org.mainframe.common.bean;

import java.io.Serializable;

public class CourseSectionBean implements Serializable {

	private String sectionNumber = null;
        private String course = null;
        private String faculty = null;
       

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    
      
}
