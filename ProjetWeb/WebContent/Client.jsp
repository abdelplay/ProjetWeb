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
<h2>Formulaire Client</h2>
<form action="MAJClient" method="post">
<c:out value=" ======== Bonjour ========="></c:out><br/>
<a href="index.jsp"> Menu</a><br/><br/>
Nom :<input type="text" name="nom"><br/>
Prenom : <input type="text" name="prenom" ><br/>
Type Client : <select name="typeclient" >
<c:forEach items="${types}" var="t">
<option value="${t.id}">${t.designation}</option>
</c:forEach>
</select>
<br/>
Adresse : <input type="text" name="adresse" size="80"><br/>
Pays : <input type="text" name="pays"><br/><br/>
<input type="submit" name="action" value="Envoyer">
<input type="reset" name="action" value="réinitialiser">
</form>
<c:set property="taille1" value="ma taille est 178 cm" scope="application" var="taille"/>
<table border="1" width="80%">
<tr>
<th>Id</th><th>Nom</th><th>Prenom</th><th>Adresse</th><th>Ville</th>
</tr>
<c:forEach items="${clients}" var="c">
<c:if test="${c.id > 4}">
<tr>
<td>${c.id}</td><td>${c.nom}</td><td>${c.prenom}</td><td>${c.adresse}</td><td>${c.pays}</td>
</tr>
</c:if>
</c:forEach>
</table>

</body>
</html>