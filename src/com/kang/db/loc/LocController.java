package com.kang.db.loc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kang.db.weather.WeatherDAO;

@WebServlet("/LocController")
public class LocController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LocController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LocDAO.getLocation(request);
		request.setAttribute("contentPage", "location/location.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LocDAO.getLocation(request);
		request.setAttribute("contentPage", "location/location.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
