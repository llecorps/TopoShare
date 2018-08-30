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

<h2>Création Location</h2>

<s:form action="location_new">
    <s:textfield name="location.datedeb" label="date début" requiredLabel="true" />
    <s:textfield name="location.datefin" label="date fin" requiredLabel="true" />
    <s:select name="location.topo.id" label="Topo"
              list="listTopo" listKey="id" listValue="libelle"
              emptyOption="true"
              requiredLabel="true"/>
    <s:select name="location.responsable.id" label="Utilisateur"
              list="listUtilisateur" listKey="id" listValue="username"
              emptyOption="true"
              requiredLabel="true"/>



    <s:submit value="OK"/>
</s:form>
</body>
</html>