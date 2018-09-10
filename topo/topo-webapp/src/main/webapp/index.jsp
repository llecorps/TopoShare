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

    <%@ include file="jsp/_include/head.jsp" %>
</head>

<body>
<%@ include file="WEB-INF/menu.jsp" %>
<s:actionerror/>
<s:actionmessage />

  <div class="container">
      <%@ include file="jsp/_include/header.jsp" %>
      <div class="connecting-line" align="center">
          <!--
          <s:a action="login"><s:text name="nav.login" /></s:a>
          -->
      </div>

    <h2><s:text name="home.welcome" /></h2>


        <s:a action="utilisateur_last"><s:text name="nav.lastUser" /></s:a>
            <br>
        <s:a action="comment_last"><s:text name="nav.lastComment" /></s:a>
            <br>
    <s:a action="location_last"><s:text name="nav.lastLocation" /></s:a>

    <footer >
        <s:a action="index">
            <s:param name="request_locale">en</s:param>
            [English]
        </s:a>
        <s:a action="index">
            <s:param name="request_locale">fr</s:param>
            [Français]
        </s:a>
    </footer>
</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <!-- Javascript de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
    <script>

</body>
</html>