<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/head.jsp" %>
</head>

<body>
<s:actionerror/>
<s:actionmessage/>

<h2>User Add</h2>

<s:form action="utilisateur_new">
    <s:textfield name="utilisateur.username" label="username" requiredLabel="true" />
    <s:textfield name="utilisateur.email" label="email" requiredLabel="true" />
    <s:textfield name="utilisateur.password" label="password" requiredLabel="true" />



    <s:submit value="OK"/>

</s:form>
</body>
</html>