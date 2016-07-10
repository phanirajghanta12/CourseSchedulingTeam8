package org.mainframe.common.bean;

import java.io.Serializable;

public class SchoolBean implements Serializable {

	private String schoolAbbrv = null;
	private String schoolName = null;

    public String getSchoolAbbrv() {
        return schoolAbbrv;
    }

    public void setSchoolAbbrv(String schoolAbbrv) {
        this.schoolAbbrv = schoolAbbrv;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
		
	
}
