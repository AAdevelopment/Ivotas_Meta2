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
    <title>Inserir Mesa de Voto</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
  </head>

  <body>
	<h2> Inserir Mesa de Voto </h2>
        <s:form action="inserirMesa" method="post">
			<s:text name="Departamento:" />
			<s:textfield name="mesa" /><br>
			<s:submit />
		</s:form>
		<br>
		<a href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a>
		<br>
		<p><s:property value="wb.mesasVoto" /></p>
  </body>
</html>