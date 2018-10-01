<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="./_include/head.jsp" %>

        <style type="text/css">

           label[for="nameFieldId"] {
               color: midnightblue;
           }
           label[for="passFieldId"] {
               color: midnightblue;
           }

        </style>
</head>

<body>
<%@ include file="../WEB-INF/menu.jsp" %>


<div class="container" >
    <%@ include file="./_include/header.jsp" %>
    <h2>Connexion</h2>



    <s:form action="login">

        <s:textfield name="Login" label="Identifiant" requiredLabel="true" id="nameFieldId"/>
        <s:password name="password" label="Mot de passe" requiredLabel="true" id="passFieldId" />
        <s:submit value="Connexion"/>
    </s:form>

</div>
</body>
</html>