<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/head.jsp" %>
</head>

<body>
<s:actionerror/>
<s:actionmessage/>
<%@ include file="../../WEB-INF/menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
<h2>Création d'un topo</h2>

<s:form action="topo_new">
    <ul>
  <li>Libelle :  <s:textfield name="topo.libelle" label="Libelle" requiredLabel="true" /></li><br>
  <li>Lieu :  <s:textfield name="topo.lieu" label="Lieu" requiredLabel="true" /></li><br>
  <li>User :   <s:select name="topo.responsable.id" label="Utilisateur"
              list="listUtilisateur" listKey="id" listValue="username"
              emptyOption="true"
              requiredLabel="true"/></li>


    <s:submit value="OK"/>
   </ul>
</s:form>
    </div>
</body>
</html>