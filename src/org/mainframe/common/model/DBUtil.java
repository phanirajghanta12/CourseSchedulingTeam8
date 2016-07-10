package org.mainframe.common.model;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {
	
	private static  BasicDataSource dataSource ;
	static{
		try{
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			dataSource.setUsername("system");
			dataSource.setPassword("tiger");
		}catch(Exception exp){
			System.out.println("\n\nException in Initialization "+exp);
			exp.printStackTrace();
		}
	}
	
	public static DataSource getDataSource(){
		return dataSource;
	}

}
