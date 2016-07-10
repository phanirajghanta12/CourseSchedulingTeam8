package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.CourseBean;

public class CourseModel {
	
	public boolean addCourse(CourseBean courseBean) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into Course Values(?,?,?,?,?,?,?,?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, courseBean.getCourseCode());
		ps.setString(2, courseBean.getCourseName());
                ps.setString(3, courseBean.getCourseDesc());
                ps.setDouble(4, courseBean.getCourseHours());
                ps.setDouble(5, courseBean.getCourseCap());
                ps.setString(6, courseBean.getOfferedFall());
                ps.setString(7, courseBean.getOfferedSpring());
                ps.setString(8, courseBean.getOfferedSummer());
                ps.setString(9, courseBean.getCoursePreReq());
                ps.setString(10, courseBean.getTeacher());
		ps.executeQuery();
		ps.close();		
		con.close();
		flag = true;
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return flag;
	}
	
	public CourseBean updateCourseBean(CourseBean courseBean) throws DataSourceException
	{
            /*
COURSECODE                                         VARCHAR2(20)
COURSENAME                                         VARCHAR2(20)
COURSEDESCRIPTION                                  CLOB
COURSEHOURS                                        NUMBER(10)
COURSECAP                                          NUMBER(10)
OFFEREDFALL                                        VARCHAR2(10)
OFFEREDSPRING                                      VARCHAR2(10)
OFFEREDSUMMER                                      VARCHAR2(10)
COURSEPREREQS                                      VARCHAR2(50)
TEACHERS                                           VARCHAR2(10)
            */
		
		try{
		String sql = "Update Course set COURSENAME = ? , COURSEDESCRIPTION = ? , COURSEHOURS = ? , COURSECAP = ?"
                        + " , OFFEREDFALL = ? ,OFFEREDSPRING = ? , OFFEREDSUMMER = ? , "
                        + " COURSEPREREQS = ? ,TEACHERS = ? Where COURSECODE = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		
		ps.setString(1, courseBean.getCourseName());
                ps.setString(2, courseBean.getCourseDesc());
                ps.setDouble(3, courseBean.getCourseHours());
                ps.setDouble(4, courseBean.getCourseCap());
                ps.setString(5, courseBean.getOfferedFall());
                ps.setString(6, courseBean.getOfferedSpring());
                ps.setString(7, courseBean.getOfferedSummer());
                ps.setString(8, courseBean.getCoursePreReq());
                ps.setString(9, courseBean.getTeacher());
                ps.setString(10, courseBean.getCourseCode());
                
		ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return courseBean;
	}
	
	
	public boolean deleteCourse(String courseCode) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From Course Where courseCode = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, courseCode);
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
	
	
	
	
	public boolean isCourseExist(String courseCode) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From Course Where CourseCode = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, courseCode);
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
        
      public static long getSelectedCourseHoursCount(String selectedCourses) throws DataSourceException
	{
		long count = 0;
		try{
		String sql = "Select sum(CourseHours) From Course Where CourseCode in("+selectedCourses+")";
              
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		//ps.setString(1, selectedCourses);
                ResultSet rs = ps.executeQuery();
		if(rs.next()){
                    //System.out.println("rs.getLong(1)"+rs.getLong(1));
			count = rs.getLong(1);
		}
		rs.close();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println("count****"+count);
              
		return count;
	}
       

}
