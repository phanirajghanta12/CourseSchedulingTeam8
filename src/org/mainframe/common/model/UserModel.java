package org.mainframe.common.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.UserBean;
import java.sql.Connection;

public class UserModel {
	
	public boolean registerUser(UserBean user) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into Users Values(?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, user.getLoginId());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getRole());
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
	
	public UserBean updateUser(UserBean user) throws DataSourceException
	{
		
		try{
		String sql = "Update Users set Password = ? , Role = ? Where LoginId = ?";
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, user.getPassword());
		ps.setString(2, user.getRole());
		ps.setString(3, user.getLoginId());
		ps.executeUpdate();
		ps.close();		
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return user;
	}
	
	
	public boolean deleteUser(String loginId) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From Users Where loginId = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, loginId);
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
	
	
	
	
	public boolean getUserByLoginId(String loginId) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From Users Where LoginId = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, loginId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			flag = true;		
		}
		ps.close();			
		rs.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return flag;
	}
        
        
        public boolean validateUserLogin(String loginId,String password) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From Users Where upper(LoginId) = ? and upper(Password) = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, loginId.toUpperCase());
                ps.setString(2, password.toUpperCase());
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			flag = true;		
		}
		ps.close();	
                rs.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return flag;
	}
        
        public String validateUserLoginGetRole(String loginId,String password) throws DataSourceException
	{
		String role = null;
		try{
		String sql = "Select * From Users Where LoginId = ? and Password = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, loginId);
                ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			role = rs.getString(1);
		}
		ps.close();	
                rs.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return role;
	}



}
