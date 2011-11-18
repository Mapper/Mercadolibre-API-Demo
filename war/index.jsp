<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Mercadolibre API Demo</title>
  </head>

  <body>
  
	<div id="fb-root"></div>
	<script>(function(d, s, id) {
	  var js, fjs = d.getElementsByTagName(s)[0];
	  if (d.getElementById(id)) {return;}
	  js = d.createElement(s); js.id = id;
	  js.src = "//connect.facebook.net/en_US/all.js#xfbml=1&appId=277062649002508";
	  fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));</script>  
  
    <h1>Hello Mercadolibre API Developer!</h1>
    
    <br>This is a super-basic-html website that shows you how to interact with the Mercadolibre API.
    
    <br>The idea of this example is that you have some code to copy&paste.
    
    <br>Do can download it from <a href="https://github.com/Fersca/Mercadolibre-API-Demo">github</a>. Everithing was done with JSP, Servlets and no frameworks.
	
	<br><br><div class="fb-like" data-href="http://api-demo-web.appspot.com/" data-send="false" data-width="450" data-show-faces="true"></div>
	
	<br>
	<br>
	
	<% if (session.getAttribute("accessToken")!=null){%>
	
		Your access token is: <font color="red"><%= session.getAttribute("accessToken") %>
		<br><br>
		<a href="actions.jsp">Interact with Mercadolibre API</a>		
	
	<% } else {%>
	
		<br>You don't have an AccessToken. 
		<br>You need it to do an advanced interaction with the Mercadolibre API
		<br><br>
		 		
		<form name="form1" action="https://auth.mercadolibre.com.ar/authorization" method="get">
			Application Client_id: 
			<input type="text" name="client_id" value="3105"/><br>
			<input type="hidden" name="response_type" value="code"/><br>
			<input type="submit" value="Get Access Token"/>											
		</form>	
	
	<% } %>
	
  </body>
</html>
