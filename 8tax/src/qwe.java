

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class qwe
 */
@WebServlet("/qwe")
public class qwe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public qwe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	float tax;
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	
	String name=request.getParameter("name");
	int income=Integer.parseInt(request.getParameter("income"));
	if(income>50000) {
		tax=(income*20)/100;
	}
	else if(250000<income&&income<500000) {
		tax=(income*10)/100;
			
	}
	else
		{tax=0;
		}
	out.println("<h2>name:"+name+"</h2>");
	out.println("<h2>tax is:"+tax+"</h2>");
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
