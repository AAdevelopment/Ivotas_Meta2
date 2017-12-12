<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Criar Eleicao</title>
</head>
<body>
	<H2>Criar Nova Eleicao</H2>
	<s:form  action="criarEleicao" method="post">
		<s:text name="Tipo:" />
		<s:textfield name="eleicao[0]" />
		<br>
		<s:text name="Título:" />
		<s:textfield name="eleicao[1]"/>
		<br>
		<br>
		<s:text name="Descrição:" />
		<s:textarea name="eleicao[2]" cols="30" rows="5"/>
		<br>
		<br>
		<s:text name="Data início HH:mm:ss dd/MM/yyyy:" />
		<s:textfield name="eleicao[3]" />
		<br>
		<br>
		<s:text name="Data fim HH:mm:ss dd/MM/yyyy:" /> 
		<s:textfield name="eleicao[4]" />
		<br>
		<br>
		<s:submit />
	</s:form>
	<br>
	<a href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a>
</body>
</html>