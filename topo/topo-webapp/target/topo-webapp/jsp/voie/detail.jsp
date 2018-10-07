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

    <li>ID : <s:property value="voie.id" /></li>
    <li>Libelle : <s:property value="voie.libelle" /></li>
    <li>Notation: <s:property value="voie.notation" /></li>
    <li>Hauteur : <s:property value="voie.hauteur" /></li>
    <li>Largeur : <s:property value="voie.largeur" /></li>
    <li>
        Topo:
        <s:a action="topo_detail">
            <s:param name="id" value="topo.id" />
            <s:property value="topo.libelle"/>

        </s:a>
    </li>

</ul>

    </div>
</body>
</html>