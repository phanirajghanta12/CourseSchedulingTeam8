package org.mainframe.common.bean;

import java.io.Serializable;

public class SemesterBean implements Serializable {

	private String semester = null;
	private String startDate = null;
        private String endDate = null;

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
        
        
    
}
