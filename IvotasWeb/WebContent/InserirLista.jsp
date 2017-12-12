<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserir Lista de Candidatos</title>
</head>
<body>
	<H2>Cadastrar Nova lista de Candidatos</H2>
	<s:form action="inserirlista" method="post">
		<s:text name="Tipo da lista:" />
		<s:textfield name="tipo"/>
		<br>
		<br>
		<s:text name="Nome da lista:" />
		<s:textfield name="nome"/>
		<br>
		<br>
		<s:text name="Candidato 1:" />
		<s:textfield name="candidatos[0]" />
		<br>
		<br>
		<s:text name="Candidato 2:" />
		<s:textfield name="candidatos[1]" />
		<br>
		<br>
		<s:text name="Candidato 3:" />
		<s:textfield name="candidatos[2]" />
		<br>
		<br>
		<s:text name="Candidato 4:" />
		<s:textfield name="candidatos[3]" />
		<br>
		<br>
		<s:text name="Candidato 5:" />
		<s:textfield name="candidatos[4]" />
		<br>
		<br>
		<s:submit />
	</s:form>
	<br>
	<a href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a>
</body>
</html>