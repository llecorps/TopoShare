<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">


    <link rel="stylesheet" type="text/css" href="WEB-INF/css/styles.css" />
    <title>Topo</title>
</head>

<body>
<%@ include file="WEB-INF/menu.jsp" %>
    <h2><s:text name="home.welcome" /></h2>
        <s:a action="utilisateur_list"><s:text name="nav.listUser" /></s:a>
            <br>
        <s:a action="topo_list"><s:text name="nav.listTopo" /></s:a>
            <br>
    <s:a action="location_list"><s:text name="nav.listLocation" /></s:a>

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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <!-- Javascript de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
    <script>

</body>
</html>