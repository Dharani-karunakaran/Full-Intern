package com.myproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteContactServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		        String name = req.getParameter("name");
		        if (Pb.phoneBook.containsKey(name)) 
		        {
		            Pb.phoneBook.remove(name);
		            out.print("Removed Successfully ");
		        }
		        else {
		          out.print("The number is not present");
		        }
}
}