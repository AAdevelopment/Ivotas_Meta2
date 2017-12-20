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
<title>Inserir Pessoa</title>
</head>
<body>
	<H2>Cadastrar nova Pessoa</H2>
	<s:form action="inserirPessoa" method="post">
		<s:text name="Tipo:" />
		<s:checkbox name="pessoa[0]" fieldValue="docente" label="docente"/>docente
		<s:checkbox name="pessoa[0]" fieldValue="aluno" label="aluno"/>aluno
		<s:checkbox name="pessoa[0]" fieldValue="funcionario" label="funcionario"/>funcionario
		<br>
		<br>
		<s:text name="name:" />
		<s:textfield name="pessoa[1]" />
		<br>
		<br>
		<s:text name="Cartao:" />
		<s:textfield name="pessoa[2]" />
		<br>
		<br>
		<s:text name="Password:" />
		<s:textfield name="pessoa[3]" />
		<br>
		<br>
		<s:text name="Dpto:" />
		<s:textfield name="pessoa[4]" />
		<br>
		<br>
		<s:text name="card_valid:" />
		<s:textfield name="pessoa[5]" />
		<br>
		<br>
		<s:text name="tel:" />
		<s:textfield name="pessoa[6]" />
		<br>
		<br>
		<s:text name="morada:" />
		<s:textfield name="pessoa[7]" />
		<br>
		<s:submit />
	</s:form>
	<br>
	<a href="<s:url action="AdminConsole"/>">Voltar ao Admin console</a>
</body>
</html>