package apidemo.search;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import framework.Search;

/**
 * @author Fernando Scasserra @fersca
 */

@SuppressWarnings("serial")
public class SearchServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
		//Get the user_id parameter from the request
		String word = req.getParameter("word");
		
		//Call the Framework to get the user info
		String json = Search.getItemList(word);									
		
		//Print the user info
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    
	    out.println("Search data: ");
	    out.println("<br><br>");
	    out.println(json);

	}
				
}
