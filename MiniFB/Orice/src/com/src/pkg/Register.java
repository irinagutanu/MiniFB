package com.src.pkg;
import Data.Person;
import Model.PersonDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Person;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean success = true;
		
		String username = request.getParameter("uname"),
			   name = request.getParameter("name"),
			   surname = request.getParameter("surname"),
			   telephone = request.getParameter("tel"),
			   email = request.getParameter("em"),
			   city = request.getParameter("ci"),
			   country = request.getParameter("co"),
			   password = request.getParameter("psw"),
			   confirmpass = request.getParameter("cpsw");
		
		Date date = new Date();
		try {
			//String s = request.get("myDate");
			String s = request.getParameter("myDate");
			SimpleDateFormat availDate = new SimpleDateFormat("yyyy-mm-dd");
			date = availDate.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Boolean sex = false;//male
		String male = request.getParameter("male"),
			   female = request.getParameter("female");
		if( female != null && female.equals("f")) {
			sex = true;
			if( male != null) {
				success = false;
				failGender(response);
			}
		}
		else if( male == null || !male.equals("m")) {
			success = false;
			failGender(response);
		}
		if(!password.equals(confirmpass) || password.length() < 6 || password.equals(name)
				|| password.equals(surname) || password.equals(username)) {
			success = false;
			failPassword(response);
		}
		Date today = new Date();
		long timeBetween = today.getTime() - date.getTime();
		double yearsBetween = timeBetween / 3.15576e+10;
		Integer age = (int) Math.floor(yearsBetween);
		
		if( success) {
			Person q  = new Person(0, username, name, surname, sex, password, telephone, 
					email, date, age, city, country);
			PersonDAO pdao = new PersonDAO();
			pdao.insertPersonDB(q);
			
			PrintWriter out = response.getWriter(); 
		    out.println("Registration successful!");
		}
	}

	private void failGender(HttpServletResponse response) throws IOException {
		// add please select a gender
		PrintWriter out = response.getWriter();
		out.println("Please go back and choose a gender");
	}

	private void failPassword(HttpServletResponse response) throws IOException {
		// add password failure motive 
		PrintWriter out = response.getWriter();
		out.println("Please go back and choose a good password");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
