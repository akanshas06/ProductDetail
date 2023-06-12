package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addlink")
public class add extends HttpServlet{ 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String quantity = req.getParameter("quantity");
		double price = Double.parseDouble(req.getParameter("price"));
		String[] add=req.getParameterValues("course");
	    PrintWriter pw =resp.getWriter();
	    pw.print("<h1>"+quantity+"</h1>");
	    pw.print("<h1>"+price+"</h1>");
	    for(int a=0;a<add.length;a++) {
	    	pw.print("<h1>"+add[a]+"</h1>");
	    
		if(add[a].equals("laptop")){
			RequestDispatcher rd = req.getRequestDispatcher("laptoplink");
			rd.include(req, resp);
		}else {
		
		
	    RequestDispatcher rd = req.getRequestDispatcher("mobilelink");
	   rd.include(req, resp);}
	}
	}

}