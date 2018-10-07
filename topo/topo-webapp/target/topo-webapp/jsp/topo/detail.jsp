<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/head.jsp"%>
    <style type="text/css">
        body{
            position: relative; /* required */
            padding-top: 100px;	/* prevent content to go underneath the fixed navbar */
            background: url('../../WEB-INF/assets/img/fond.jpg') no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            background-size: cover;
            -o-background-size: cover;
        }
    </style>
</head>

<body>
<s:actionerror/>
<s:actionmessage />
<%@ include file="../menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>


<h2><s:text name="nav.detailTopo" /></h2>

<ul>

    <li>ID : <s:property value="topo.id" /></li>
    <li>Libelle : <s:property value="topo.libelle" /></li>
    <li>Lieu : <s:property value="topo.lieu" /></li>
    <li>Secteur : <s:property value="topo.secteur" /></li>
    <li>Statut : <s:property value="topo.statut" /></li>
    <li>
        Username:
        <s:a action="utilisateur_detail">
            <s:param name="id" value="topo.idUtilisateur" />
            <s:property value="utilisateur.username"/>
        Mail :
            <s:property value="utilisateur.email"/>
        </s:a>
    </li>

</ul>


    <s:a action="comment_new"><s:text name="nav.newComment" /></s:a>
    </div>
</body>
</html>