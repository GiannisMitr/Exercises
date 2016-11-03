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
 * Servlet implementation class Exercise3
 */
@WebServlet("/Exercise3")
public class Exercise3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	
    	
    try{
    	int temp= Integer.parseInt(request.getParameter(request.getParameterNames().nextElement()));
boolean bool=true;
    	
    	for(int i=2;i<temp;i++){
    		if(temp%i==0){
    			bool=false;
    		}
    	}		
    			
		if(bool){
			response.getWriter().append("Success!");
		}
		else{
			request.getRequestDispatcher("/hello").forward(request, response);
		}
    		
    		
    		
   }
    		catch(NoSuchElementException e)
    		{response.getWriter().append("Please provide an input as an argument ?value=11\n"+e);
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
