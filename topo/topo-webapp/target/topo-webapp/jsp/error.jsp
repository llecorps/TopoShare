<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ticket</title>
</head>

<body>
<h2><s:text name="error.title" /></h2>

<s:actionerror />

<s:bean name="java.util.Date" var="now" />
<s:text name="error.metadata">
    <s:param value="now" />
</s:text>

</body>
</html>