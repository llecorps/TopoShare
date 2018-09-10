<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User</title>
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
    </style>
</head>

<body>
<%@ include file="../../WEB-INF/menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
<h2><s:text name="nav.listUser" /></h2>



<ul>
    <s:iterator value="listUtilisateur">
        <li>
            <s:a action="utilisateur_list">
                <s:param name="id" value="idutilisateur" />
                <s:property value="username"/>--
                <s:property value="email"/>--
                <s:property value="password"/>
            </s:a>

        </li>
    </s:iterator>
</ul>
<h3><s:text name="nav.funcUser" /></h3>
<s:a action="utilisateur_new"><s:text name="nav.newUser" /></s:a>
</div>
</body>
</html>