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
<h2>Création Location</h2>

<s:form action="location_new">
    <ul>
   <li>Date de début : <s:textfield name="location.datedeb" label="date début" requiredLabel="true" /></li><br>
   <li>Date de fin : <s:textfield name="location.datefin" label="date fin" requiredLabel="true" /></li><br>
   <li>Topo : <s:select name="location.topo.id" label="Topo"
              list="listTopo" listKey="id" listValue="libelle"
              emptyOption="true"
              requiredLabel="true"/></li><br>
    <li>User :<s:select name="location.responsable.id" label="Utilisateur"
              list="listUtilisateur" listKey="id" listValue="username"
              emptyOption="true"
              requiredLabel="true"/></li>


    </ul>
    <s:submit value="OK"/>
</s:form>
    </div>
</body>
</html>