package com.lti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.UserAddressDao;
import com.lti.model.Address;
import com.lti.model.User;

/**
 * Servlet implementation class UserAddressServlet
 */
public class UserAddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAddressServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("uname");
		String email = request.getParameter("umail");
		String password = request.getParameter("pass");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		int pin =Integer.parseInt(request.getParameter("pass")) ;
		
		
		User us=new User();
		
		us.setName(name);
		us.setEmail(email);
		us.setPassword(password);
	
		UserAddressDao adrdao = new UserAddressDao();
		adrdao.save(us);
		
		 us=adrdao.fetch(us.getId());
		Address addr=new Address();
		addr.setStreet(street);
		addr.setCity(city);
		addr.setCountry(country);
		addr.setPincode(pin);
		
		addr.setUser(us);
		adrdao.saveAddr(addr);
		
	}

}
