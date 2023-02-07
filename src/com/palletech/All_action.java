package com.palletech;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class All_action {
	
	private static final String url = "jdbc:mysql://localhost:3306/assi";
	private static final String username = "root";
	private static final String password = "ashish";
	
	private static Connection con = null;
	private static Statement s = null;
	private static PreparedStatement ps = null;
	
	public void creating()
	{
		Connection con = null;
		Statement s = null;
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assi","root","ashish");
			
			//prepare sql statement
			s = con.createStatement();
			
			//execute query
			String qry = "create table employee (eno int primary key, ename varchar(30), esal int)";
			s.executeUpdate(qry);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{//closing connection
			try {
				if(s != null)
				s.close();
				if(con !=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void inserting(int a, String b ,int c)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
			ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setInt(3, c);
			
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(ps != null)
				ps.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void updating(int a, String b, int c)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
			String qry = "update employee set ename = ? , esal = ? where eno = ?";
			ps = con.prepareStatement(qry);
			ps.setString(1, b);
			ps.setInt(2, c);
			ps.setInt(3, a);
			
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(ps != null)
				ps.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void delete(int no)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
			String qry = "delete from employee where eno = ?";
			ps = con.prepareStatement(qry);
			ps.setInt(1, no);
			
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(ps != null)
				ps.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
