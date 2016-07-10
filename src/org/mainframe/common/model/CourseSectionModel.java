package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.CourseSectionBean;

public class CourseSectionModel {
	
	public boolean addCourseSection(CourseSectionBean courseSectionBean) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into CourseSection Values(?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, courseSectionBean.getSectionNumber());
		ps.setString(2, courseSectionBean.getCourse());
                ps.setString(3, courseSectionBean.getFaculty());
                         
		ps.executeUpdate();
		ps.close();		
		con.close();
		flag = true;
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return flag;
	}
	
	public CourseSectionBean updateCourseBean(CourseSectionBean courseSectionBean) throws DataSourceException
	{
            /*

SECTIONNUMBER                                      VARCHAR2(50)
COURSE                                             VARCHAR2(100)
FACULTY                                            VARCHAR2(100)
SEMESTER                                           VARCHAR2(200)                                         VARCHAR2(10)
            */
		
		try{
		String sql = "Update CourseSection set COURSE = ? , FACULTY = ?   "
                        + " Where SECTIONNUMBER = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		
		ps.setString(1, courseSectionBean.getCourse());
                ps.setString(2, courseSectionBean.getFaculty());               
                ps.setString(3, courseSectionBean.getSectionNumber());
                               
		ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return courseSectionBean;
	}
	
	
	public boolean deleteCourseSection(String sectionNumber) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From CourseSection Where SectionNumber = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, sectionNumber);
		int count = ps.executeUpdate();
		if(count >= 1){
			flag = true;
		}
		ps.close();			
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return flag;
	}
	
	
	
	
	public boolean isCourseSectionExist(String sectionNumber) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From CourseSection Where sectionNumber = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, sectionNumber);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			flag = true;			
		}
		rs.close();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return flag;
	}
        
      

}
