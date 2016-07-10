package org.mainframe.common.exp;

public class DataSourceException  extends Exception{

	public DataSourceException(){
		
	}
	public DataSourceException(String expMsg){
		System.out.println(expMsg);
	}
}
