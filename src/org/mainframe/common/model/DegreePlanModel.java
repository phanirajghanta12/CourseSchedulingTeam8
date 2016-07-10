package org.mainframe.common.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.DegreePlanBean;

public class DegreePlanModel {
	
	public boolean addDegree(DegreePlanBean degreePlanBean) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into DegreePlan Values(?,?,?,?,?,?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, degreePlanBean.getDegreeCode());
		ps.setString(2, degreePlanBean.getDeptTrack());
                ps.setString(3, degreePlanBean.getDescription());
                ps.setDouble(4, degreePlanBean.getHoursReq());
                ps.setString(5, degreePlanBean.getType());
                ps.setString(6, degreePlanBean.getCourses());
                ps.setString(7, degreePlanBean.getGradSchool());
                ps.setDouble(8, degreePlanBean.getForecast());              
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
	
	public DegreePlanBean updateDegreePlanBean(DegreePlanBean degreePlanBean) throws DataSourceException
	{
            /*
DEGREECODE                                         VARCHAR2(20)
DEPT_TRACK                                         VARCHAR2(50)
DESCRIPTION                                        VARCHAR2(50)
HOURSREQ                                           NUMBER(10)
TYPE                                               VARCHAR2(10)
COURSES                                            VARCHAR2(100)
GRAD_SCHOOL                                        VARCHAR2(20)
FORECAST                                           NUMBER(10)
            */
		
		try{
		String sql = "Update DegreePlan set DEPT_TRACK = ? , DESCRIPTION = ? , HOURSREQ = ? , TYPE = ?"
                        + " , COURSES = ? ,GRAD_SCHOOL = ? , FORECAST = ?  "
                        + " Where DEGREECODE = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		
		ps.setString(1, degreePlanBean.getDeptTrack());
                ps.setString(2, degreePlanBean.getDescription());
                ps.setDouble(3, degreePlanBean.getHoursReq());
                ps.setString(4, degreePlanBean.getType());
                ps.setString(5, degreePlanBean.getCourses());
                ps.setString(6, degreePlanBean.getGradSchool());
                ps.setDouble(7, degreePlanBean.getForecast());  
                ps.setString(8, degreePlanBean.getDegreeCode());                
		ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return degreePlanBean;
	}
	
	
	public boolean deleteDegreePlan(String degreeCode) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From DegreePlan Where degreeCode = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, degreeCode);
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
	
	
	
	
	public boolean isDegreeExist(String degreeCode) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From DegreePlan Where DegreeCode = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, degreeCode);
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
