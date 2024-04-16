package com.gentech.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Utility
{
	public static int getRecordsCount(String query)
	{
		Connection conn=null;
		int recordsCount=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gentechdb", "root", "root");
			PreparedStatement stmt=conn.prepareStatement(query);
			
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				recordsCount=recordsCount+1;
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return recordsCount;
	}
	
	public static boolean insertRecords(String query)
	{
		Connection conn=null;
		boolean isStatus=false;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gentechdb", "root", "root");
			PreparedStatement stmt=conn.prepareStatement(query);
			int val=stmt.executeUpdate();
			
			if(val==1)
			{
				isStatus=true;
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return isStatus;
	}
	
	public static int getColumnsCount(String query)
	{
		Connection conn=null;
		int columnsCount=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gentechdb", "root", "root");
			PreparedStatement stmt=conn.prepareStatement(query);
			
			ResultSet rs=stmt.executeQuery();
			columnsCount=rs.getMetaData().getColumnCount();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return columnsCount;
	}
}
public class UtilityDemo {
	public static void main(String[] args) {
	/*	int rc=Utility.getRecordsCount("select * from emp");
		System.out.println("# of Records :"+rc);
	
		boolean v1=Utility.insertRecords("insert into dept values(50,'HEALTH','BANGALORE')");
		System.out.println("insert record status :"+v1);
	*/
		int cc=Utility.getColumnsCount("select * from emp");
		System.out.println("# of Columns :"+cc);
	}

}
