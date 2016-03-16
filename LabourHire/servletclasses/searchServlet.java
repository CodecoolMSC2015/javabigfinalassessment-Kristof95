package servletclasses;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import socketclientclasses.SocketClient;

public class searchServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String searchCriteria = request.getParameter("search");
		String radio1 = (String) request.getParameter("searchtype");
		SocketClient clientSocket;
		if(searchCriteria != null)
		{
			clientSocket = new SocketClient("localhost",4444,searchCriteria);
		}
	}

}
