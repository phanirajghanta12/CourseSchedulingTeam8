package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mainframe.common.exp.DataSourceException;
import org.mainframe.common.bean.StudentBean;
import org.mainframe.common.bean.StudentCourseBean;

public class StudentModel {
	
	public boolean addStudent(StudentBean studentBean) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Insert Into Student Values(?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, studentBean.getStudentId());
		ps.setString(2, studentBean.getDegreeCode());
                ps.setString(3, studentBean.getGraduationDate());
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
	
	public StudentBean updateStudent(StudentBean studentBean) throws DataSourceException
	{
   /*
 STUDENTID                                          NUMBER(20)
 DEGREECODE                                         VARCHAR2(50)
 GRADUATION                                         VARCHAR2(50)
*/
		
		try{
		String sql = "Update Student set DEGREECODE = ? , GRADUATION = ? Where STUDENTID = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		
		
		ps.setString(1, studentBean.getDegreeCode());
                ps.setString(2, studentBean.getGraduationDate());
                ps.setString(3, studentBean.getStudentId());
                ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return studentBean;
	}
	
	
	public boolean deleteStudent(String studentId) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From Student Where studentId = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, studentId);
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
	
	
	
	
	public boolean isStudentExist(String studentId) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From Student Where StudentId = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, studentId);
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
        
     
       public boolean addStudentCourse(StudentCourseBean studentCourseBean) throws DataSourceException
	{
            /*
            
            */
		boolean flag = false;
		try{
		String sql = "Insert Into StudentCourse Values(?,?,?,?,?)";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, studentCourseBean.getStudentId());
		ps.setString(2, studentCourseBean.getCourseId());
                ps.setString(3, studentCourseBean.getCourseDesc());
                ps.setString(4, studentCourseBean.getTerm());
                ps.setString(5, studentCourseBean.getGrade());                
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
	
	public StudentCourseBean updateStudentCourse(StudentCourseBean studentCourseBean) throws DataSourceException
	{
   /*
 
STUDENTID                                          NUMBER(10)
COURSEID                                           VARCHAR2(20)
COURSEDESC                                         VARCHAR2(200)
TERM                                               VARCHAR2(20)
GRADE                                              VARCHAR2(20)

*/
		
		try{
		String sql = "Update StudentCourse set COURSEID = ? , COURSEDESC = ?, TERM = ?, GRADE = ? Where STUDENTID = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		
		
		ps.setString(1, studentCourseBean.getCourseId());
                ps.setString(2, studentCourseBean.getCourseDesc());
                ps.setString(3, studentCourseBean.getTerm());
                ps.setString(4, studentCourseBean.getGrade());
                ps.setString(5, studentCourseBean.getStudentId());
                ps.executeUpdate();
		ps.close();	
		con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
		return studentCourseBean;
	}
	
	
	public boolean deleteStudentCourse(String studentId) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Delete From StudentCourse Where studentId = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, studentId);
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
	
	public boolean isStudentCourseExist(String studentId) throws DataSourceException
	{
		boolean flag = false;
		try{
		String sql = "Select * From StudentCourse Where StudentId = ?";
		Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
		ps.setString(1, studentId);
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
