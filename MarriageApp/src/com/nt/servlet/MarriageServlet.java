package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MarriageServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name,gender=null;
		int age =0;
		//general setting
		PrintWriter pw = null;
		pw = resp.getWriter();
		resp.setContentType("text/html");
		//read data which available in form
name=req.getParameter("name");
gender=req.getParameter("gender");
age=Integer.parseInt(req.getParameter("age")) ;
//request processing logic
if(gender.equalsIgnoreCase("M"))
{
  if(age>=21)
	pw.println("mr u r eligible for marriage");
  else
	  pw.println("chhotu concentrate on study");
	}//if
else if(gender.equalsIgnoreCase("F"))
{
  if(age>=18)
	pw.println("miss u r eligible for marriage");
  else
	  pw.println("madam concentrate on study");
	}//elseif
pw.println("<a href='input.html'>home</a>");
	//close the file
pw.close();
	}
	
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
doGet(req,resp);
}
}