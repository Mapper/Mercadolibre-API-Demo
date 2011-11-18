package apidemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import static framework.Oauth.getAccessToken;

/**
 * @author Fernando Scasserra @fersca
 */

@SuppressWarnings("serial")
public class Api_demo_webServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		//Get the access token from the URL		
		String code = req.getParameter("code");
		
		String accessToken=getAccessToken(code);
		
		//Get the session object		
		HttpSession session = req.getSession(true);
		
		//Persist the access tokjen in the session
		session.setAttribute("accessToken", accessToken);		
		
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    
	    out.println("Access Token: "+accessToken);
	    out.println("<br><a href=\"index.jsp\">Go to Home</a>");

	}
			
}
