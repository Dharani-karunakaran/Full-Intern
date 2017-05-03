package com.myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class ViewContactServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		 @SuppressWarnings("unused")
		String name = req.getParameter("name");
		  @SuppressWarnings("unused")
		Pb pb=new Pb();
		 @SuppressWarnings("rawtypes")
		Set s=Pb.phoneBook.entrySet();
		 @SuppressWarnings("rawtypes")
		Iterator itr=s.iterator();
		 while(itr.hasNext()){
			 @SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) itr.next();
			 out.println(entry.getKey()+"\n "+entry.getValue()+"");
			 
		 }
		
		
	}
}
