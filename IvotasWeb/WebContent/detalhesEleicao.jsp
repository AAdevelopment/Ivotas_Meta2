<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
    <link href="cover.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Eleicao</title>
</head>
<body>
	
	<p>tipo: <s:property value="eleicao[0]" /></p>
	<br>
	<br>
	<p>Título: <s:property value="eleicao[1]" /></p>
	<br>
	<br>
	<p>Descrição:<s:property value="eleicao[2]" /></p>
	<br>
	<br>
	<p>Data início:<s:property value="eleicao[3]"/></p>
	<br>
	<br>
	<p>Data fim:<s:property value="eleicao[4]"/></p>
	<br>
	<br>
	<p>Listas: </p>
	<br>
	<c:forEach
		items="${Candidatos}" var="value">
		<p class="lead">
			<a  style="color:#fff" href="<s:url action="Vote"/>" class="btn btn-lg btn-secondary"><c:out value="${value}" /></a><br>
			<c:set var="Candidatos" scope="session" value="${value}"></c:set>
		</p>
	</c:forEach>
	<a href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a>
	<br>
</body>
</html>