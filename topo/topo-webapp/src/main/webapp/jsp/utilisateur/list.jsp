<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <%@ include file="../_include/head.jsp" %>


<body>
<%@ include file="../menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
<h2><s:text name="nav.listUser" /></h2>



<ul>
    <s:iterator value="listUtilisateur">
        <li>
            <s:a action="utilisateur_list">
                <s:param name="id" value="idutilisateur" />
                <s:property value="username"/>--
                <s:property value="email"/>--
                <s:property value="password"/>
            </s:a>

        </li>
    </s:iterator>
</ul>
    <%@ include file="../_include/footer.jsp" %>
</div>
</body>
</html>