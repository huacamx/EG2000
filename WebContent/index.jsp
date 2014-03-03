<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Generador de examenes</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="estilo.css" charset="utf-8"></link>
<title>Insert title here</title>
</head>
<body>
<div id="header">
	<h1>Bienvenidos al Generador de examenes</h1>
</div>


<div id="form">
	<s:form method="post" action="login">
	<s:textfield label="User"  key="user.username"></s:textfield><br/>
	<s:password label="Password" key="user.password"></s:password>
	<s:submit label="Entrar"></s:submit>
</s:form>
</div>


</body>
</html>