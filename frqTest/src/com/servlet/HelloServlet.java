package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private Gson gson_ = new Gson();
	private JsonObject obj = new JsonObject();
	
	private int data[] = {
			32768,45307,55938,63041,65535,63041,55938,
			45307,32768,20228,9597,2494,0,2494,9597,20228,
			32768,45307,55938,63041,65535,63041,55938,
			45307,32768,20228,9597,2494,0,2494,9597,20228
	};
	private int commData[] = new int[32];
	private int cnt = 0;
	
	AccData accData = new AccData(0,32, data);
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		commData = accData.getData();
		String json = this.gson_.toJson(accData);
		
		System.out.print(cnt++);
		System.out.println(json);
		
		PrintWriter out = response.getWriter();
		out.write(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
