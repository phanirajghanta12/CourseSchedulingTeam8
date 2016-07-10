package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.SemesterBean;

public class SemesterModel {
	
	public boolean addSemester(SemesterBean semesterBean) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into Semester Values(?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, semesterBean.getSemester());
		ps.setString(2, semesterBean.getStartDate());
                ps.setString(3, semesterBean.getEndDate());
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
	
	public SemesterBean updateSemester(SemesterBean semesterBean) throws DataSourceException
	{
            /*


 SEMESTER                                           VARCHAR2(50)
 STARTDATE                                          VARCHAR2(50)
 ENDDATE                                            VARCHAR2(50)

            */
		
		try{
		String sql = "Update SEMESTER set STARTDATE = ? , ENDDATE = ? Where SEMESTER = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		
		ps.setString(3, semesterBean.getSemester());
		ps.setString(1, semesterBean.getStartDate());
                ps.setString(2, semesterBean.getEndDate());
                
		ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return semesterBean;
	}
	
	
	public boolean deleteSemester(String semester) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From Semester Where semester = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, semester);
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
	
	
	
	
	public boolean isSemesterExist(String semester) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From Semester Where semester = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, semester);
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
