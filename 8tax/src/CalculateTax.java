

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
@WebServlet("/CalculateTax")
public class CalculateTax extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	 public CalculateTax() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	float tax;;
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			
			String name=request.getParameter("name");
			int income=Integer.parseInt(request.getParameter("income"));
			if(income>500000)
			{
				tax=(income*20)/100;
				
			}
			else if(250000<income&&income<500000)
			{
				tax=(income*10)/100;
			}
			else
			{
				tax=0;
			}
			out.println("<h2>Name:"+name+"</h2>");
			out.println("<h2>Calculated Tax:</h2>");
	out.println("<h2>"+tax +"</h2");

       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}