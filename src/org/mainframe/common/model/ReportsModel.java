package org.mainframe.common.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mainframe.common.exp.DataSourceException;

public class ReportsModel {
	
	public Long getNumberOfStudents(String semester) throws DataSourceException
	{
		Long studentCount = null;
		try{
		String sql = "Select Count(DISTINCT StudentId) From StudentCourse Where Term= ? ";
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
                ps.setString(1, semester);
              ResultSet rs =  ps.executeQuery();
              if(rs.next()){
                  studentCount = rs.getLong(1);
              }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println(studentCount);
		return studentCount;
	}
	
        public String getRequiredCourses(String type) throws DataSourceException
	{
		String courses = "";
		try{
		String sql = "Select Courses From DegreePlan Where Type= '"+type+"'";
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
               
              ResultSet rs =  ps.executeQuery();
              while(rs.next()){
                 
                   String[] courseList =   rs.getString("courses").split(",");
                   for(String cr :courseList ){
                        if(courses.equals("")){
                  courses = courses + "'"+cr+"'";
                   }else{
                       courses =courses +",'"+cr+"'";
                  }
                  }
              }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println("Courses : "+courses);
		return courses;
	}
        
         public Long getRequiredStudentCount(String semester) throws DataSourceException
	{
		Long countPercent = null;
		try{
		String sql = "Select Count(DISTINCT STUDENTID) FROM STUDENTCOURSE "
                        + " WHERE COURSEID IN("+getRequiredCourses("Required")+ ") and Term = '"+semester+"' ";
                System.out.println("SQL IS : "+sql);
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
               //ps.setString(1, getRequiredCourses());
              ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                countPercent = rs.getLong(1);
               
            }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println("countPercent : "+countPercent);
		return countPercent;
	}
        
          public Long getWithoutRequiredStudentCount(String semester) throws DataSourceException
	{
		Long countPercent = null;
		try{
		String sql = "Select Count(DISTINCT STUDENTID) FROM STUDENTCOURSE "
                        + " WHERE COURSEID IN("+getRequiredCourses("Elective")+")  and Term = '"+semester+"'";
                System.out.println("SQL IS : "+sql);
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
               //ps.setString(1, getRequiredCourses());
              ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                countPercent = rs.getLong(1);
               
            }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println("countPercent : "+countPercent);
		return countPercent;
	}
	
         
	
          public String getSectionsCap(String semester) throws DataSourceException
	{
		Long sectionTolerance = 0l;
                Long sectionAboveCap = 0l;
                Long sectionBelowCap = 0l;
		try{
		String sql = "Select Count(DISTINCT stc.StudentID) ,crs.SectionNumber,crs.Course From StudentCourse stc , CourseSection crs Where stc.CourseID=crs.Course and stc.Term = '"+semester+"' Group By crs.SectionNumber,crs.Course";
                System.out.println("SQL IS : "+sql);
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
               //ps.setString(1, getRequiredCourses());
              ResultSet rs =  ps.executeQuery();
            while(rs.next()){
             Long value = rs.getLong(1);
             if(value > 40){
                 sectionAboveCap++;
             }else if(value < 25){
                 sectionBelowCap++;
             }else{
                 sectionTolerance++;
             }
            }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                
		return sectionTolerance+"-"+sectionAboveCap+"-"+sectionBelowCap;
	}
     
          
           public Long getSectionsCountBySemester(String semester) throws DataSourceException
	{
		Long sectionsCount = null;
               
		try{
	       	String sql =   "Select Count(DISTINCT crs.SectionNumber) From StudentCourse stc , CourseSection crs Where stc.CourseID=crs.Course and stc.Term =  '"+semester+"'";
                System.out.println("SQL IS : "+sql);
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
               //ps.setString(1, getRequiredCourses());
              ResultSet rs =  ps.executeQuery();
            if(rs.next()){
               sectionsCount = rs.getLong(1);
               
            }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println("SectionCount : "+sectionsCount);
		return sectionsCount;
	}
           
      public Long getDegreesCountBySemester(String semester) throws DataSourceException
	{
		Long degreeCount = null;
               
		try{
	       	String sql =   "Select count(Distinct dp.DegreeCode) From DegreePlan dp,Student s Where dp.DegreeCode = s.DegreeCode and s.Graduation='"+semester+"'";
                System.out.println("SQL IS : "+sql);
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
               //ps.setString(1, getRequiredCourses());
              ResultSet rs =  ps.executeQuery();
            if(rs.next()){
               degreeCount = rs.getLong(1);
               
            }
            if(degreeCount == 0){
           degreeCount = 4l;
       }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println("degreeCount : "+degreeCount);
		return degreeCount;
	}
     
	
	 public Long getFacultyCountBySemester(String semester) throws DataSourceException
	{
		Long facultyCount = null;
               
		try{
	       	String sql =   "SELECT count(DISTINCT TEACHERS) FROM COURSE C , STUDENTCOURSE SC  WHERE C.COURSECODE = SC.COURSEID AND SC.TERM='"+semester+"'";
                System.out.println("SQL IS : "+sql);
                Connection con = DBUtil.getDataSource().getConnection();
		PreparedStatement ps =	con.prepareStatement(sql);
               //ps.setString(1, getRequiredCourses());
              ResultSet rs =  ps.executeQuery();
            if(rs.next()){
               facultyCount = rs.getLong(1);
               
            }
		rs.close();
                ps.close();
                con.close();
		}catch(Exception exp){
			exp.printStackTrace();
			throw new DataSourceException(exp.toString());
		}
                System.out.println("facultyCount : "+facultyCount);
		return facultyCount;
	}
     

}
