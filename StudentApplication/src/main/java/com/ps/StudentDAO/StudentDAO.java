package com.ps.StudentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ps.student.Connector;
import com.ps.student.Student;

public class StudentDAO {
	public static boolean signup(String name,long phone, String mail,String branch,String loc,String password) {
		
		Connection con = null;
		PreparedStatement ps=null;
		String sql="insert into student(name,phone,email,branch,loc,password) values(?,?,?,?,?,?)";
		int res=0;
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setLong(2, phone);
			ps.setString(3, mail);
			ps.setString(4, branch);
			ps.setString(5, loc);
			ps.setString(6, password);
			res=ps.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		if(res>0) {
			return true;
		}
		
		return false;
	}
	
	public static Student getStudent(long phone) {
		Student s=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs= null;
		
		String query ="select * from student where phone=?";
		
		try {
			con = Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setLong(1, phone);
			rs=ps.executeQuery();
			if(rs.next()) {
				s=new Student();
				s.setId(rs.getInt(1));	
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		return s;
		
	}

}
