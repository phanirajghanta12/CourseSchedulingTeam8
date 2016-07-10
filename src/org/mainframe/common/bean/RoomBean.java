package org.mainframe.common.bean;

import java.io.Serializable;

public class RoomBean implements Serializable {

	private String roomNumber = null;
	private String courseCode = null;
        private String capacity = null;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

   
    
}
