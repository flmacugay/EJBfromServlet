package com.mac.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EJBImplementer
 */
@WebServlet("/EJBImplementer")
public class EJBImplementer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private com.mac.stateless.BeanCounterRemote beanStateless;
	
	@EJB
	private com.mac.stateful.BeanCounterRemote beanStateful;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EJBImplementer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Count from stateless bean is : "+beanStateless.getCount());
		response.getWriter().println("Count from stateful bean is : "+beanStateful.getCount());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
