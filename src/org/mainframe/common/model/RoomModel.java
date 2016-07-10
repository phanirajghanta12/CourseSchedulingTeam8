package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.RoomBean;

public class RoomModel {
	
	public boolean addRoom(RoomBean roomBean) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into Room Values(?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, roomBean.getRoomNumber());
		ps.setString(2, roomBean.getCourseCode());
                ps.setString(3, roomBean.getCapacity());
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
	
	public RoomBean updateRoom(RoomBean roomBean) throws DataSourceException
	{
            /*


ROOMNUMBER                                         VARCHAR2(50)
COURSECODE                                         VARCHAR2(50)
CAPACITY                                           VARCHAR2(50)


            */
		
		try{
		String sql = "Update Room set COURSECODE = ? , CAPACITY = ? Where ROOMNUMBER = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		
		ps.setString(3, roomBean.getRoomNumber());
		ps.setString(1, roomBean.getCourseCode());
                ps.setString(2, roomBean.getCapacity());
                
		ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return roomBean;
	}
	
	
	public boolean deleteRoom(String roomNumber) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From Room Where ROOMNUMBER = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, roomNumber);
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
	
	
	
	
	public boolean isRoomExist(String roomNumber) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From Room Where ROOMNUMBER = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, roomNumber);
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
