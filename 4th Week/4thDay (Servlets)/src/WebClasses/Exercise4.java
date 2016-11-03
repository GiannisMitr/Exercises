package WebClasses;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercise4
 */
@WebServlet("/Exercise4")
public class Exercise4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	
    	
        try{
        	
   
        	Enumeration<String> temp1 =request.getParameterNames();
        	while(true){
        		String elem =temp1.nextElement();
        		response.getWriter().append(elem+":"+request.getParameter(elem));
        	}		
        	
        		
        		
        		
       }
        		catch(NoSuchElementException e)
        		{response.getWriter().append("Please prvide some query arguments\n"+e.toString());
        		}
        	
    		}
           	
        	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
