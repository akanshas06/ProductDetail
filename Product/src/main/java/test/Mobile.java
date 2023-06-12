package test;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mobilelink")
public class Mobile extends HttpServlet{ 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double Price = Double.parseDouble(req.getParameter("Price"));
		double gst =( 18 * Price)/100;;
		double totalBill = Price + gst;

		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>+total price with gst"+totalBill+"</h1>");
		
		
		}
		
	}