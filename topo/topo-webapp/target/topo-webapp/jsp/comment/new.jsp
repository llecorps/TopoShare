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

    <%@ include file="../_include/head.jsp" %>
</head>

<body>
<%@ include file="../../WEB-INF/menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
<h2>Commentaire</h2>
<s:form action="comment_new">
    <s:textfield name="commentaire.description" label="commentaire" requiredLabel="true" size="100"/>
        <s:select name="commentaire.topoguide.id" label="Topo"
              list="listTopo" listKey="id" listValue="libelle"
              emptyOption="true"
              requiredLabel="true"/>


    <s:submit value="OK"/>
</s:form>
</div>
</body>
</html>
