<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ticket</title>
</head>

<body>
<h2><s:text name="nav.listTopo" /></h2>

<ul>
    <s:iterator value="listTopo">
        <li>
            <s:a action="topo_list">
                <s:param name="id" value="idtopo" />
                <s:property value="libelle"/>
                <s:property value="utilisateur_idutilisateur"/>
                <s:property value="location_utilisateur_idutilisateur"/>
                <s:property value="lieu"/>
            </s:a>

        </li>
    </s:iterator>
</ul>
<br>
<h3><s:text name="nav.funcTopo" /></h3>
<s:a action="topo_detail"><s:text name="nav.detailTopo" /></s:a>
<s:a action="topo_new"><s:text name="nav.newTopo" /></s:a>
</body>
</html>