<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="icon" href="../../../../favicon.ico">

<title>IVOTAS WEB</title>

<!-- Bootstrap core CSS -->
<link href="bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">
</head>
<body>
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = 'https://connect.facebook.net/pt_PT/sdk.js#xfbml=1&version=v2.11&appId=554418018235346';
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>
	
	<div class="container">
		<h2 class="form-signin-heading">Please sign in Ivotas Web</h2>
		<s:form action="login" method="post">
			<s:text name="Username:" />
			<s:textfield name="username" />
			<br>
			<s:text name="Password:" />
			<s:password name="password" />
			<br>
			<s:submit />
		</s:form>
	</div>
	<br>
	<div class="fb-login-button" data-max-rows="1" data-size="medium" 
		data-button-type="continue_with" data-show-faces="false" 
		data-auto-logout-link="false" data-use-continue-as="false">
	</div>
	<!-- /container -->
</body>
</html>