package com.myproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.xml.bind.helpers.ParseConversionEventImpl;

import com.google.apphosting.utils.config.AppYaml.StaticFile;

@SuppressWarnings("serial")
public class PhoneBookServlet extends HttpServlet {
        
        static PhoneBook pb= new PhoneBook();
	    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String phoneno=(req.getParameter("phoneno"));
		String email=req.getParameter("email");												
		String address=req.getParameter("address");
		String name=req.getParameter("name");
		System.out.println(phoneno+" "+email+" "+name+" "+address);
		pb.setAddress(address);	
		pb.setEmail(email);
		pb.setPhoneno(phoneno);
		pb.setName(name);
		Pb p=new Pb();
		boolean b=p.addContact();
		if(b){
			out.println("contact added successfully");
			req.getRequestDispatcher("index.html").forward(req, resp);
		}
	}
		
}
