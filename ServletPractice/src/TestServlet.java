

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter html = response.getWriter();
//        try {
//    		html.println("<html>");
//    		html.println("<head>");
//    		html.println("<title>TestServlet</title>");            
//    		html.println("</head>");
//    		html.println("<body>");
//    		html.println("<h1>This is a test form on "+ request.getContextPath() + "</h1>");
//    		html.println("<p> "+ request.getParameter("lName") + ", " + request.getParameter("fName") + " </p>");
//    		html.println("</body>");
//    		html.println("</html>");
//        } catch (Exception e) {
//            Logger.getLogger("Failed to create response.");
//        } finally {
//        		html.close();
//        }
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter html = response.getWriter();
    		html.println("<html>");
    		html.println("<head>");
    		html.println("<meta charset=\"UTF-8\">");
    		html.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    		html.println("<title>TestServlet</title>");            
    		html.println("</head>");
    		html.println("<body>");
    		html.println("<h1>Click Submit to see how your name appears in the phone book</h1>");
    		html.println("<form action=\"servletTest\" method=\"POST\">");
    		html.println("<label for=\"fName\">First Name:</label>");
    		html.println("<input type=\"text\" name=\"fName\"> ");
    		html.println("<label for=\"lName\">Last Name:</label>");
    		html.println("<input type=\"text\" name=\"lName\">");
    		html.println("<input type=\"submit\" value=\"Submit\">");
    		html.println("</form>");
    		html.println("</body>");
    		html.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter html = response.getWriter();
    		html.println("<html>");
    		html.println("<head>");
    		html.println("<title>TestServlet</title>");            
    		html.println("</head>");
    		html.println("<body>");
    		html.println("<h3>Your name would look like this</h3>");
    		html.println("<p> "+ request.getParameter("lName") + ", " + request.getParameter("fName") + " </p>");
    		html.println("</body>");
    		html.println("</html>");
	}

}
