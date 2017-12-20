<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="cover.css" rel="stylesheet">
 <link href="bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Eleições</title>
</head>
<body style="background-color:#333">
	<main role="main" class="inner cover">
	<h2 style="color:#fff">Lista de Eleições</h2> 
	<c:forEach
		items="${wb.eleicoesTitles}" var="value">
		<p class="lead">
			<a  style="color:#fff" href="<s:url action="dtEleicao"/>" class="btn btn-lg btn-secondary"><c:out value="${value}" />
			<c:set var = "titulo" scope = "session" value = "${value}" /></a><br>
		</p>
	</c:forEach>
	<a style="color:#fff" href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a> 
	</main>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../../../assets/js/vendor/popper.min.js"></script>
    <script src="../../../../dist/js/bootstrap.min.js"></script>
</body>
</html>