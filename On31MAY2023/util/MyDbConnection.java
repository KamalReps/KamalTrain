package com.train.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//import java.util.Collection;

public class MyDbConnection {
	
	static Connection   oracon;
	
	public static Connection getMyConnection(){
		
		//MyDbConnection mdb = new MyDbConnection();
		
		try {
			
			oracon=   DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracleee#4578");
						
			//System.out.println("Connection Established : "+oracon);
			} 	
			catch (SQLException e) 
				{
					e.printStackTrace();			
				}
		return oracon;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Connected To DB Succesfully : "+getMyConnection());

	}

}
