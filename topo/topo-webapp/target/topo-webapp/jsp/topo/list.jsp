<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Topo</title>
    <%@ include file="../_include/head.jsp" %>
</head>

<body>
<%@ include file="../menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>

<h2><s:text name="nav.listTopo" /></h2>

<ul>
    <s:iterator value="listTopo">
        <li>

            <s:a action="topo_detail">
                <s:param name="id" value="id" />
                <s:property value="libelle"/>
            </s:a>


        </li>

        </li>
    </s:iterator>
</ul>
<br>
<h3><s:text name="nav.funcTopo" /></h3>

<s:a action="topo_new"><s:text name="nav.newTopo" /></s:a>
    <%@ include file="../_include/footer.jsp" %>
    </div>
</body>
</html>