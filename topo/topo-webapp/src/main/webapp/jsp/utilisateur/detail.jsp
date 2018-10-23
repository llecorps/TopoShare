<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>

    <%@ include file="../_include/head.jsp"%>


<body>
<s:actionerror/>
<s:actionmessage/>
<%@ include file="../menu.jsp" %>
<h2><s:text name="nav.detailUser" /></h2>

<ul>
    <li>ID : <s:property value="utilisateur.id" /></li>
    <li>Username : <s:property value="utilisateur.username" /></li>
    <li>Email : <s:property value="utilisateur.email" /></li>
    <li>Password : <s:property value="utilisateur.password" /></li>
</ul>
<%@ include file="../_include/footer.jsp" %>
</body>
</html>