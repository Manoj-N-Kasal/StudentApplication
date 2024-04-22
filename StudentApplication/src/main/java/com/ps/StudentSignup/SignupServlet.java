package com.ps.StudentSignup;

import java.io.IOException;
import java.io.PrintWriter;

import com.ps.StudentDAO.StudentDAO;
import com.ps.student.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")

public class SignupServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String phone =req.getParameter("phone");
		String email =req.getParameter("email");
		String branch =req.getParameter("branch");
		String loc =req.getParameter("location");
		String pass =req.getParameter("password");
		String confirm =req.getParameter("confirm");
		PrintWriter out = resp.getWriter();
		StudentDAO sdao = new StudentDAO();
		Student s = new Student();
		long phn =Long.parseLong(phone);
		boolean res=false;
		if(pass.equals(confirm)) {
		res=StudentDAO.signup(name, phn, email, branch, loc, pass);
		if(res) {
			s=StudentDAO.getStudent(phn);
			out.println("<h1> Data added Succesfully, Your student id is </h1> " +s.getId());	
		}
		else {
			out.println("<h1>Failed to save data</h1>");
		}
		}
		else {
			out.println("<h1>Password mismatch please try again </h1>");
			
		}
		
	}

}
