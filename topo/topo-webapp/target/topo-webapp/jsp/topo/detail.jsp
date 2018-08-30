<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/head.jsp"%>
</head>

<body>


<h2><s:text name="nav.detailTopo" /></h2>

<ul>

    <li>ID : <s:property value="topo.id" /></li>
    <li>Libelle : <s:property value="topo.libelle" /></li>
    <li>Lieu : <s:property value="topo.lieu" /></li>
    <li>
        Owner :
        <s:a action="utilisateur_detail">
            <s:param name="id" value="topo.utilisateur_idutilisateur" />
            <s:property value="topo.utilisateur.username"/>
            <s:property value="projet.utilisateur.email"/>
        </s:a>
    </li>

</ul>
</body>
</html>