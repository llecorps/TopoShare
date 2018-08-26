<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/head.jsp"%>
</head>

<body>


<h2><s:text name="nav.detailLocation" /></h2>

<ul>

    <li>ID : <s:property value="location.id" /></li>
    <li>Date début : <s:property value="location.datedeb" /></li>
    <li>Date fin : <s:property value="location.datefin" /></li>
    <li>
        Owner :
        <s:a action="utilisateur_detail">
            <s:param name="id" value="location.utilisateur_idutilisateur" />
            <s:property value="location.utilisateur.username"/>
            <s:property value="location.utilisateur.email"/>
        </s:a>
    </li>
    <li>
        Topo :
        <s:a action="topo_detail">
            <s:param name="id" value="location.topo_idtopo" />
            <s:property value="location.topo.libelle"/>
            <s:property value="location.topo.lieu"/>
        </s:a>
    </li>

</ul>
</body>
</html>