package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String length = request.getParameter("size");
		int size = Integer.parseInt(length);
		final String password = "omegapope";
		String uname = request.getParameter("uname");
		String userattempt = request.getParameter("password");
		String input = request.getParameter("input");
		ArrayList<String> list = new ArrayList<String>();
		if (userattempt.equals(password)) {
			out.print("<h3>Welcome "+uname+"!</h3>");
			out.print("<h3>Your list:</h3>");
			for(int i = 0; i < size; i++) {
				list.add(input);
	        }
			for(int i = 0; i < list.size(); i++) {
	            out.print(list.get(i)+"<br>");
	        }
			
			String img = request.getParameter("animal");
			out.print("<h3>"+img+"</h3><br>");

			out.print("<img src=\""+img+".jpg\">");
		}
		else {
			out.print("<h3>Wrong password!</h3>");
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
