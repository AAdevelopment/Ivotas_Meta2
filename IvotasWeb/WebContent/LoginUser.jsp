<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>IVOTAS WEB Voter</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">
    <link href="signin.css" rel="stylesheet">
  </head>

  <body>
  	<s:if test="hasActionErrors()">
   		<div class="errors">
      		<s:actionerror/>
   		</div>
	</s:if>
	
    <div class="container">
        <h2 class="form-signin-heading">Please sign in Ivotas Web</h2>
        <s:form action="userclient" method="post">
			<s:text name="cartão do cidadão:" />
			<s:textfield  key="global.username" name="username" /><br>
			<s:text name="Password:"  />
			<s:password  key="global.password" name="password"/><br>
			<s:submit />
		</s:form>
    </div> <!-- /container -->
    <br>
    <br>
    <a href="<s:url action="loginAdmin"/>">go to Admin Sign in</a>
  </body>
</html>