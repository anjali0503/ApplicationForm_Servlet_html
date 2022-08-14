package com.main.applicationservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Parameter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/AapplicationServlet")
public class AapplicationServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String firstName, lastName, gender, qualification, languages;
		firstName = request.getParameter("firstName");
		lastName = request.getParameter("lastName");
		gender = request.getParameter("gender");
		qualification = request.getParameter("edu");
		languages = request.getParameter("lang");

		String langs[] = request.getParameterValues("lang");

		PrintWriter out = response.getWriter();
		out.println("<h1> Welcome..! </h1>");
		out.println("First Name :" + firstName);

		out.println("Last Name :" + lastName);
		out.println("Gender :" + gender);
		out.println("Qualification : " + qualification);
		out.println("Languages :");
		for (String string : langs) {
			out.println(string);
		}

	}

}
