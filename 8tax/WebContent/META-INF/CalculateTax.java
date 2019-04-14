

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class CalculateTax extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculateTax</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculateTax at " + request.getContextPath() + "</h1>");
           double income=Double.parseDouble(request.getParameter("income"));
           String username=request.getParameter("username");
           double tax=0;
           if(income<=250000)
           {
               tax=0;
           }
           else if(income>250000 && income<=500000)
           {
               tax=income*0.10;
           }
           else
           {
               tax=income*0.20;
           }
           out.println("<h1>Name: "+username+"</h1>");
           out.println("<h1>Income: "+income+"</h1>");
           out.println("<h1>Tax: "+tax+"</h1>");
           out.println("<h1>Total: "+(tax+income)+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}