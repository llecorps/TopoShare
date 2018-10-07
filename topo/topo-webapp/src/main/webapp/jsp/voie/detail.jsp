<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>

    <%@ include file="../_include/head.jsp"%>


<body>
<s:actionerror/>
<s:actionmessage />
<%@ include file="../menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>


<h2><s:text name="nav.detailTopo" /></h2>

<ul>

    <li>ID : <s:property value="voie.id" /></li>
    <li>Libelle : <s:property value="voie.libelle" /></li>
    <li>Notation: <s:property value="voie.notation" /></li>
    <li>Hauteur : <s:property value="voie.hauteur" /></li>
    <li>Largeur : <s:property value="voie.largeur" /></li>
    <li>
        Topo:
        <s:a action="topo_detail">
            <s:param name="id" value="topo.id" />
            <s:property value="topo.libelle"/>

        </s:a>
    </li>

</ul>
    <%@ include file="../_include/footer.jsp" %>
    </div>
</body>
</html>