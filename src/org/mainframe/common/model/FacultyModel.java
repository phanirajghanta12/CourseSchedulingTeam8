package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.FacultyBean;

public class FacultyModel {
	
	public boolean addFaculty(FacultyBean facultyBean) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into Faculty Values(?,?,?,?,?,?,?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, facultyBean.getFirstName());
		ps.setString(2, facultyBean.getLastName());
                ps.setString(3, facultyBean.getGradSchool());
                ps.setString(4, facultyBean.getDegree());
                ps.setString(5, facultyBean.getTitle());
                ps.setString(6, facultyBean.getDaysToTeach());
                ps.setDouble(7, facultyBean.getMaxLoadFall());
                ps.setDouble(8, facultyBean.getMaxLoadSpring());
                ps.setDouble(9, facultyBean.getMaxLoadSummer());                   
                
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
	
	public FacultyBean updateFaculty(FacultyBean facultyBean) throws DataSourceException
	{
		
		try{
		String sql = "Update Faculty set LastName = ? , Grad_School = ? , Degree = ? , Title = ?"
                        + " , DaysToTeach = ? ,MaxLoadFall = ? , MaxLoadSpring = ? , "
                        + " MaxLoadSummer = ? Where FirstName = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, facultyBean.getLastName());
                ps.setString(2, facultyBean.getGradSchool());
                ps.setString(3, facultyBean.getDegree());
                ps.setString(4, facultyBean.getTitle());
                ps.setString(5, facultyBean.getDaysToTeach());
                ps.setDouble(6, facultyBean.getMaxLoadFall());
                ps.setDouble(7, facultyBean.getMaxLoadSpring());
                ps.setDouble(8, facultyBean.getMaxLoadSummer());   
                ps.setString(9, facultyBean.getFirstName());
		ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return facultyBean;
	}
	
	
	public boolean deleteFaculty(String firstName) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From Faculty Where FirstName = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, firstName);
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
	
	
	
	
	public boolean isFacultyExist(String firstName) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From Faculty Where FirstName = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, firstName);
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
