<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ticket</title>
</head>

<body>
<%@ include file="../../WEB-INF/menu.jsp" %>
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
</body>
</html>