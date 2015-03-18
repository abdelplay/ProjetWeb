<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Formulaire de saisie</title>
</head>
<body>
<h2>Saisie du type Client</h2>
<a href="index.jsp"> Menu</a><br/><br/>

<form action="MAJTypeClient" method="post">
Designation :<input type="text" name="des"><br/>
<input type="submit" name="action" value="Envoyer">
<input type="reset" name="action" value="réinitialiser">
</form>
<table border="1" width="80%">
<tr>
<th>Id</th><th>Designation</th>
</tr>
<c:forEach items="${types}" var="c">
<tr>
<td>${c.id}</td><td>${c.designation}</td>
</c:forEach>
</table>
</body>
</html>