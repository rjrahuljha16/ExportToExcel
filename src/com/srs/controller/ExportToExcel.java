package com.srs.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srs.bean.Employee;

@WebServlet("/ExportToExcel")

public class ExportToExcel extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public ExportToExcel() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List employees =new ArrayList();
		employees.add(new Employee("Rahul", "kumar", "24"));
		employees.add(new Employee("Umang", "Shaw", "24"));
		request.setAttribute("employees", employees);
		RequestDispatcher rd= request.getRequestDispatcher("report.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List employees =new ArrayList();
		employees.add(new Employee("Rahul", "kumar", "24"));
		employees.add(new Employee("Umang", "Shaw", "24"));
		request.setAttribute("employees", employees);
		RequestDispatcher rd =request.getRequestDispatcher("excelreport.jsp");
		rd.forward(request, response);
	}

}
