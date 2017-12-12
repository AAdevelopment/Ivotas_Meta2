<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>IVOTAS WEB</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
  </head>
  <body>
    <div class="container">
        <h2 class="form-signin-heading">Please sign in Ivotas Web</h2>
        <s:form action="login" method="post">
			<s:text name="Username:" />
			<s:textfield name="username" /><br>
			<s:text name="Password:" />
			<s:textfield name="password"/><br>
			<s:submit />
		</s:form>
    </div> <!-- /container -->
  </body>
</html>