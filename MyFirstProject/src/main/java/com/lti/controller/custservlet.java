package com.lti.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

/**
 * Servlet implementation class custservlet
 */
public class custservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public custservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("txtcustid"));
//		String name = request.getParameter("txtxcustname");
		String city = request.getParameter("txtcustcity");

//		Customer cust = new Customer();
//		cust.setCname(name);
//		cust.setCity(city);
//		
//		PrintWriter out=response.getWriter();
//		
//		CustomerDao dao = new CustomerDao();
//		cust=dao.fetch(id);
//		out.println(cust.getCname());
//		out.println(cust.getCity());

		Customer cust = new Customer();
//		cust.setCname(name);
		cust.setCity(city);

		PrintWriter out=response.getWriter();

		CustomerDao dao = new CustomerDao();
		List<Customer> cust1=new ArrayList<Customer>();
		cust1=dao.fetchByCity(city);
		for(Customer c1 :cust1){
		out.println(c1);
		}
	
	}

}





