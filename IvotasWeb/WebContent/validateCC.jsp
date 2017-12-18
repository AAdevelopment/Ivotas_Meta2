<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Validar CC</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
    <link href="cover.css" rel="stylesheet">
  </head>
<body>
	<h2>Digite o n�mero do seu cart�o do Cidad�o</h2>
	<br>
	<s:form action="autenticateCC" method="post">
			<s:text name="cart�o do cidad�o:" />
			<s:textfield name="CC" /><br>
			<s:submit />
		</s:form>
</body>
</html>