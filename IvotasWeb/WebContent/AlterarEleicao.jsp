<%@ taglib prefix="s" uri="/struts-tags"%>
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
<title>Alterar Eleicao</title>
</head>
<body>
	
	<H2>Alterar Eleicao</H2>
	<s:form  action="AlterarELeicao" method="post">
		<s:text name="Título:" />
		<s:textfield name="titulo"/>
		<s:text name="novo Tipo:" />
		<br>
		<br>
		<s:checkbox name="array[0]" fieldValue="docente" label="docente"/>docente
		<s:checkbox name="array[0]" fieldValue="aluno" label="aluno"/>aluno
		<s:checkbox name="array[0]" fieldValue="funcionario" label="funcionario"/>funcionario
		<br>
		<br>
		<s:text name="Título:" />
		<s:textfield name="array[1]"/>
		<br>
		<br>
		<s:text name="Descrição:" />
		<br>
		<s:textarea name="array[2]" cols="30" rows="5"/>
		<br>
		<br>
		<s:text name="Data início HH:mm:ss dd/MM/yyyy:" />
		<s:textfield name="array[3]" />
		<br>
		<br>
		<s:text name="Data fim HH:mm:ss dd/MM/yyyy:" /> 
		<s:textfield name="array[4]" />
		<br>
		<br>
		<s:submit/> <input type="button" value="Refresh form" onClick="document.location.reload(true)">
	</s:form>
	<br>
	<br>
	<a href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a>
</body>
</html>