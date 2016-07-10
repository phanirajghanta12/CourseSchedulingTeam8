package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.SchoolBean;

public class GradSchoolModel {
	
	public boolean addSchool(SchoolBean school) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into GradSchool Values(?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, school.getSchoolAbbrv());
		ps.setString(2, school.getSchoolName());
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
	
	public SchoolBean updateSchool(SchoolBean school) throws DataSourceException
	{
		
		try{
		String sql = "Update GradSchool set GradSchoolName = ? Where GradSchoolAbbrev = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, school.getSchoolName());
                ps.setString(2, school.getSchoolAbbrv());                
		ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return school;
	}
	
	
	public boolean deleteSchool(String schoolAbbrv) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From GradSchool Where GradSchoolAbbrev = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, schoolAbbrv);
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
	
	
	
	
	public SchoolBean getSchoolByAbbrev(String shcoolAbbrev) throws DataSourceException
	{
		SchoolBean schoolBean = null;
		try{
		String sql = "Select * From GradSchool Where GradSchoolAbbrev = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, shcoolAbbrev);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			schoolBean = new SchoolBean();
			schoolBean.setSchoolAbbrv(rs.getString(1));
			schoolBean.setSchoolName(rs.getString(2));
					
		}
		rs.close();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return schoolBean;
	}
        
        
        public boolean verifySchoolAbbrev(String schoolAbbrev) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From GradSchool Where GradSchoolAbbrev = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, schoolAbbrev);
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
