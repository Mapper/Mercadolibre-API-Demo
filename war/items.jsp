<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Mercadolibre API Demo</title>
  </head>

  <body>
  
    <h1>Hello Mercadolibre API Developer!</h1>

	Items API:<br><br>
	
	Example:<br> 
	<a href="https://api.mercadolibre.com/items/MLA119903293">https://api.mercadolibre.com/items/MLA119903293</a>
	
	<br><br>List a New Item - Free listing (Using your logged user):
	
	<form name="form1" action="item" method="post">
		title:
		<input type="text" name="title" value="Item de testeo - No ofertar"/><br>
		Category:
		<input type="text" name="category" value="MLA3530"/> <a href="https://api.mercadolibre.com/categories/MLA3530">https://api.mercadolibre.com/categories/MLA3530 (Others)</a><br>
		Price:
		<input type="text" name="price" value="1"/><br>
		Quantity:
		<input type="text" name="quantity" value="1"/><br>		
		<input type="submit" value="List the Item!"/>											
	</form>	
	
  </body>
</html>