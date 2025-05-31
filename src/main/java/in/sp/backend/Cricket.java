package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Cricket extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String myname = request.getParameter("name1");
		String myage = request.getParameter("age1");
		String myrole = request.getParameter("role1");
		String myarea = request.getParameter("area1");
		PrintWriter out = response.getWriter();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","shubham@1510");
			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
			ps.setString(1, myname);
			ps.setString(2, myage);
			ps.setString(3, myrole);
			ps.setString(4, myarea);
			
			int count=ps.executeUpdate();
			if(count > 0)
			{
				response.setContentType("text/html");
				out.print("<h3 style='color:green'>Successfully Submitted</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("cricket.jsp");
				rd.include(request, response);
			}
			else
			{
				response.setContentType("text/html");
				out.print("<h3 style='color:red'>Your Information Are not Successfully Submitted</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("cricket.jsp");
				rd.include(request, response);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
			response.setContentType("text/html");
			out.print("<h3 style='color:red'> Exception occured : "+ e.getMessage() +"</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("cricket.jsp");
			response.setContentType("text/html");
			rd.include(request, response);
		}
	}
}
