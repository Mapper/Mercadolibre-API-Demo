package apidemo.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import framework.Oauth;
import framework.User;

/**
 * @author Fernando Scasserra @fersca
 */

@SuppressWarnings("serial")
public class UserServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String me = req.getParameter("me");
		
		String json;
		
		if ("true".equals(me)){
			//Read the session looking for the access token
			String accessToken = Oauth.getAccessToken(req);
			
			//Send the Access token to the framework in order to get my own data
			json = User.getMeInfo(accessToken);
		} else {
			
			//Get the user_id parameter from the request
			String userId = req.getParameter("userId");
			
			//Call the Framework to get the user info
			json = User.getUserInfo(userId);
		}
									
		//Print the user info
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    
	    out.println("User data: ");
	    out.println("<br><br>");
	    out.println(json);

	}
			
}
