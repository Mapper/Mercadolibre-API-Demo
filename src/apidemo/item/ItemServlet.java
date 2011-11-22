package apidemo.item;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import framework.Item;
import framework.Oauth;

/**
 * @author Fernando Scasserra @fersca
 */

@SuppressWarnings("serial")
public class ItemServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
		//Get the user_id parameter from the request
		String quantity = req.getParameter("quantity");
		String price = req.getParameter("price");
		String category = req.getParameter("category");
		String title = req.getParameter("title");
		
		String accessToken = Oauth.getAccessToken(req);
		
		//Call the Framework to get the user info
		String json = Item.listItem(quantity, title, category, price, accessToken);									
		
		//Print the user info
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    
	    out.println("List Item: ");
	    out.println("<br><br>");
	    out.println(json);

	}
	
}
