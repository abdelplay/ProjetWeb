package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.TypeClient;
import model.dao.TypeClientDAO;

/**
 * Servlet implementation class MAJTypeClient
 */
@WebServlet("/MAJTypeClient")
public class MAJTypeClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	TypeClientDAO  tdao = new TypeClientDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MAJTypeClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("types", tdao.getAllTypes());
     	request.getRequestDispatcher("TypeClient.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String des = request.getParameter("des");
     	tdao.create(new TypeClient(des));
     	doGet(request, response);
		
	}

}
