<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Topo</title>
</head>

<body>
    <h2><s:text name="home.welcome" /></h2>
        <s:a action="utilisateur_list"><s:text name="nav.listUser" /></s:a>
            <br>
        <s:a action="topo_list"><s:text name="nav.listTopo" /></s:a>

    <footer>
        <s:a action="index">
            <s:param name="request_locale">en</s:param>
            [English]
        </s:a>
        <s:a action="index">
            <s:param name="request_locale">fr</s:param>
            [Français]
        </s:a>
    </footer>
</body>
</html>