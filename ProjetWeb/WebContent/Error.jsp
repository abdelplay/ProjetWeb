<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>ERROR</title>
</head>
<body>
<c:out value="${taille}"/><br/>
<c:out value="${client.nom}"/>
<c:out value="${option}"></c:out>
<a href="index.jsp"> Menu</a><br/><br/>
</body>
</html>