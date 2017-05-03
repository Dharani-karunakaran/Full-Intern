package com.myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchContactServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String name = req.getParameter("name");
        
		Pb pb = new Pb();
		String result=pb.searchNumber(name);
		out.println(result);
		
	}
}