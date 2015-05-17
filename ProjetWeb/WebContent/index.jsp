<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Formulaire Principal</title>
</head>
<body>
<h2>Menu</h2>
<a href="MAJClient"> Client </a><br/><br/>
<a href="MAJTypeClient"> Type Client</a><br/><br/>
<a href="TagJSP.jsp"> Client</a><br/><br/>
<!-- <a href="Client.jsp"> Client</a><br/><br/> -->
<!-- <a href="TypeClient.jsp"> Type Client</a><br/><br/> -->

<form action="TagJSP.jsp"  method="get">
Nom : <input type="text" name="nom">
Prenom : <input type="text" name="prenom">

<input type="submit">
</form>
</body>
</html>