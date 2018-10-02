package com.emertxe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// Accessing the context information of application

		ServletContext ctx = getServletContext();

		// accessing single context parameter

		// String str = ctx.getInitParameter("Name");

		// out.println(str);

		// accessing multiple context / application parameter

		Enumeration<String> e = ctx.getInitParameterNames();

		while (e.hasMoreElements()) {

			String str = ctx.getInitParameter(e.nextElement());
			out.println(str + "<br>");
		}

		// Accessing servlet initialization parameter

		ServletConfig con = getServletConfig();

		String str = con.getInitParameter("Name");

		out.println("servlet init parameter:" + str);
	}

}
