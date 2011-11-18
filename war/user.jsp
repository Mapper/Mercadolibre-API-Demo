<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Mercadolibre API Demo</title>
  </head>

  <body>
  
    <h1>Hello Mercadolibre API Developer!</h1>

	Users API:<br><br>
	
	Example:<br> 
	<a href="https://api.mercadolibre.com/users/1234">https://api.mercadolibre.com/users/1234</a>
	
	<br><br>Interact with the API:
	
	<form name="form1" action="user" method="get">
		user_id:
		<input type="text" name="userId" value="1234"/><br>
		<input type="submit" value="Get User Info"/>											
	</form>	

	Get MyInfo:
	
	<form name="form1" action="user" method="get">
		<input type="hidden" name="me" value="true">
		<input type="submit" value="Get My Info"/>										
	</form>	
	
  </body>
</html>