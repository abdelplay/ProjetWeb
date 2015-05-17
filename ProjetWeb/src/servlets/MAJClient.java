package servlets;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import model.bo.Client;
import model.bo.TypeClient;
import model.dao.ClientDAO;
import model.dao.HibernateUtil;
import model.dao.TypeClientDAO;

/**
 * Servlet implementation class MAJClient
 */
@WebServlet("/MAJClient")
public class MAJClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ClientDAO cdao = new ClientDAO();
	TypeClientDAO tdao = new TypeClientDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MAJClient() {
        super();
        // TODO Auto-generated constructor stub
    	SessionFactory sf = HibernateUtil.getSessionFactory();
    	//sf.openSession();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<TypeClient> types = tdao.getAllTypes();
		request.setAttribute("types", types);
		
		List<Client> clients = cdao.getAllClient();
		request.setAttribute("clients", clients);
	    request.getRequestDispatcher("Client.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String pays = request.getParameter("pays");
		String option = request.getParameter("typeclient");
		
		Client c = new Client(nom, prenom, adresse, pays);
		c.setTypec(tdao.getById(Long.parseLong(option)));
		request.setAttribute("client", c);
	//	request.getSession().setAttribute("client", c);
		
	cdao.create(c);
		
		doGet(request, response);
//		request.setAttribute("option", option);
//		
//		request.getRequestDispatcher("Client.jsp").forward(request, response);
	}

}
