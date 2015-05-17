<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Formulaire de saisie</title>
<script type="text/javascript">

function surligne(champ, erreur)
{
   if(erreur)
      champ.style.backgroundColor = "#fba";
   else
      champ.style.backgroundColor = "";
}

function verifPseudo(champ)
{
   if(champ.value.length < 2 || champ.value.length > 80 || champ.value == " ")
   {
      surligne(champ, true);
      return false;
   }
   else
   {
      surligne(champ, false);
      return true;
   }
}

function verifMail(champ)
{
   var regex = /^[a-zA-Z0-9._-]+@[a-z0-9._-]{2,}\.[a-z]{2,4}$/;
   if(!regex.test(champ.value))
   {
      surligne(champ, true);
      return false;
   }
   else
   {
      surligne(champ, false);
      return true;
   }
}



function verifAge(champ)
{
   var age = parseInt(champ.value);
   if(isNaN(age) || age < 5 || age > 111)
   {
      surligne(champ, true);
      return false;
   }
   else
   {
      surligne(champ, false);
      return true;
   }
}

function verifForm(f)
{
   var pseudoOk = verifPseudo(f.nom);
   
   if(pseudoOk)
      return true;
   else
   {
      alert("Veuillez remplir correctement tous les champs");
      return false;
   }
}

</script>

</head>
<body>
<h2>Formulaire Client</h2>
<form action="MAJClient" method="post" name="frm" onsubmit="return verifForm(frm)">
<c:out value=" ======== Bonjour ========="></c:out><br/>
<a href="index.jsp"> Menu</a><br/><br/>
Nom :<input type="text" name="nom" onblur="verifPseudo(this)"><br/>
Prenom : <input type="text" name="prenom" onblur="verifPseudo(this)"><br/>
Type Client : <select name="typeclient" >
<c:forEach items="${types}" var="t">
<option value="${t.id}">${t.designation}</option>
</c:forEach>
</select>
<br/>
Adresse : <input type="text" name="adresse" size="80" onblur="verifPseudo(this)"><br/>
Pays : <input type="text" name="pays" onblur="verifPseudo(this)"><br/><br/>
<input type="submit" name="action" value="Envoyer">
<input type="reset" name="action" value="réinitialiser">
</form>
<c:set value="ma taille est 178 cm" scope="session" var="taille"/>
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