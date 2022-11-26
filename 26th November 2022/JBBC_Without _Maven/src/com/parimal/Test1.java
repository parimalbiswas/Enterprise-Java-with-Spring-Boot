package com.parimal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Test1
{

	public static void main(String[] args) throws SQLException
	{

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		String url1 = "jdbc:mysql://localhost:3306/nitin";
		String user1 = "root";
		String password1 = "India@4444";
		Connection connection = DriverManager.getConnection(url1, user1, password1);

		Statement statement = connection.createStatement();

		String sqlSelectQuary = "select sid,sname,sage,sadd from student";
		ResultSet rSet = statement.executeQuery(sqlSelectQuary);

		while (rSet.next())
		{
			int sid = rSet.getInt("sid");
			String sname = rSet.getString("sname");
			int sage = rSet.getInt("sage");
			String sadd = rSet.getString("sadd");
			System.out.println(sid + "=" + sname + "=" + sage + "=" + sadd);
		}

		rSet.close();
		statement.close();
		connection.close();

	}

}
