package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
        // Getting servlet request URL
        //
        String url = request.getRequestURL().toString();

        //
        // Getting servlet request query string.
        //
        String queryString = request.getQueryString();

        //
        // Getting request information without the hostname.
        //
        String uri = request.getRequestURI();

        //
        // Below we extract information about the request object path
        // information.
        //
        String scheme = request.getScheme();
        String serverName = request.getServerName();
        int portNumber = request.getServerPort();
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String pathInfo = request.getPathInfo();
        String query = request.getQueryString();

        //Sample URL 
        // http://localhost:8080/JavaServerTest/hello/test?test=s
        
        //response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("Url: " + url + "");
        pw.println("Uri: " + uri + "");
        pw.println("Scheme: " + scheme + "");
        pw.println("Server Name: " + serverName + "");
        pw.println("Port: " + portNumber + "");
        pw.println("Context Path: " + contextPath + "");
        pw.println("Servlet Path: " + servletPath + "");
        pw.println("Path Info: " + pathInfo + "");
        pw.println("Query: " + query);
	}

}
