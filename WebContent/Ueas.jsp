
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="Ex.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ueas</title>
</head>
<body>
	<h1>
	 	Bienvénido 
		<s:property value="user.getUsername()"/>
	</h1>
	<div id="lista-ueas">
	<h2>Lista de UEAs</h2>
	<p><s:property value="user.getListaUea().get(0).getNombreUEA()"/></p>
	<p><s:property value="user.getListaUea().get(1).getNombreUEA()"/></p>
	<p><s:property value="user.getListaUea().get(2).getNombreUEA()"/></p>
	
	
	
	<p>
		
	</p>
	</div>
</body>
</html>