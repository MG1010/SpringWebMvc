<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Events Portal | Sign in</title>
</head>
<body>

	<h2>Sign in</h2>
	<p><font color="red">${errorMessage}</font></p>
	<form action="login" type="text" name="login" method="post">
		<div>
			<input type="text" name="username" placeholder="Username"/>
		</div>	
		<div>
			<input type="password" name="password" placeholder="Password"/>
		</div>
		<div>
			<input type="submit" value="Login"/>
		</div>
	</form>
	
	<p style="color:red;">${invalidcredentialsmessage}</p>

</body>
</html>