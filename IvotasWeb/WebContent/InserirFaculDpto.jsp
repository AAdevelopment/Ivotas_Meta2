<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserir Faculdade/Dpto</title>
</head>
<body>
	<H2>Cadastrar Faculdade/Dpto</H2>
	<s:form action="inserirFaculdade" method="post">
		<s:text name="nome da Faculdade:" />
		<s:textfield name="nome"/>
		<br>
		<br>
		<s:text name="Departamento1:" />
		<s:textfield name="dpto[0]" />
		<br>
		<br>
		<s:text name="Departamento2:" />
		<s:textfield name="dpto[1]" />
		<br>
		<br>
		<s:text name="Departamento3:" />
		<s:textfield name="dpto[2]" />
		<br>
		<br>
		<s:submit />
	</s:form>
	<br>
	<a href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a>
</body>
</html>