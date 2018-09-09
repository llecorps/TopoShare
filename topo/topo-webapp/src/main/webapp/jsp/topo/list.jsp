<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Topo</title>
    <style type="text/css">
        body{
            position: relative; /* required */
            padding-top: 100px;	/* prevent content to go underneath the fixed navbar */
            background: url('assets/img/fond.jpg') no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            background-size: cover;
            -o-background-size: cover;
        }
</head>
            </style>

<body>
<%@ include file="../../WEB-INF/menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>

<h2><s:text name="nav.listTopo" /></h2>

<ul>
    <s:iterator value="listTopo">
        <li>

            <s:a action="topo_detail">
                <s:param name="id" value="id" />
                <s:property value="lieu"/>
            </s:a>

            Owner :
            <s:a action="utilisateur_detail">
                <s:param name="id" value="topo.utilisateur_idutilisateur" />
                <s:property value="topo.utilisateur.username"/>
                <s:property value="projet.utilisateur.email"/>
            </s:a>
        </li>

        </li>
    </s:iterator>
</ul>
<br>
<h3><s:text name="nav.funcTopo" /></h3>

<s:a action="topo_new"><s:text name="nav.newTopo" /></s:a>
    </div>
</body>
</html>