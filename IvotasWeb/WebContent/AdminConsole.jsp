<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  
  <head>
	 <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
    <link href="cover.css" rel="stylesheet">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
  </head>
  <title>Admin.Console</title>
  <body>
	<h2>Admin Options:</h2>
	<br>
	<br>
	<br>
	<ol type="1">
		<li><a href="<s:url action="Pessoa"/>">Registrar Pessoas</a><br><br></li>
		<li><a href="<s:url action="Faculdade"/>">Inserir departamentos e faculdades</a><br><br></li>
		<li><a href="<s:url action="ExludeDptoform"/>">Excluir departamentos </a><br><br></li>
		<li><a href="<s:url action="alterDptoform"/>">Alterar departamentos </a><br><br></li>
		<li><a href="<s:url action="Eleicao"/>">Criar eleição</a><br><br></li>
		<li><a href="<s:url action="ListaEleicoes"/>">Consultar detalhes de eleição</a><br><br></li>
		<li><a href="<s:url action="Candidatos"/>">Gerir listas de candidatos</a><br><br></li>
		<li><a href="<s:url action="Mesa"/>">Gerir mesas de voto</a><br><br></li>
		<li><a href="<s:url action="altEleicao"/>">Alterar propriedade da eleição</a><br><br></li>
	</ol>
  </body>
</html>