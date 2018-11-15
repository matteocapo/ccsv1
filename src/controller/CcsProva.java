package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CcsProva
 */
@WebServlet("/CcsProva")
public class CcsProva extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CcsProva() {
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String ora = "nulla";
		if((ora = request.getParameter("datetimes")) != null) {
			System.out.println(ora);
		}
		
		String message = "Dashboard CCS v1";
	    request.setAttribute("message", message); // This will be available as ${message}
	     
	    //media velocità
	    request.setAttribute("domenica", "350");
	    request.setAttribute("lunedì", "340");

	     
	    //oee
	    request.setAttribute("oee","80%");
	    
	    //scarti e produzioni
	    request.setAttribute("produzioni", "200562");
	    request.setAttribute("scarti", "8000"); 
	     
	    //velocità ultima ora
	         
	    request.setAttribute("min1", "255"); 
	    request.setAttribute("min2", "230"); 
	    request.setAttribute("min3", "200");
	    request.setAttribute("min4", "201"); 
	    request.setAttribute("min5", "320"); 
	    request.setAttribute("min6", "350");
	    
	    
	    request.getRequestDispatcher("/indexprova.jsp").forward(request, response);

		
	}

   /**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	* 
	*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	*	// TODO Auto-generated method stub
	*	doGet(request, response);
	*}
	*/

}
