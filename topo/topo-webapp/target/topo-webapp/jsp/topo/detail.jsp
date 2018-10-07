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

    <li>ID : <s:property value="topo.id" /></li>
    <li>Libelle : <s:property value="topo.libelle" /></li>
    <li>Lieu : <s:property value="topo.lieu" /></li>
    <li>Secteur : <s:property value="topo.secteur" /></li>
    <li>Statut : <s:property value="topo.statut" /></li>
    <li>
        Username:
        <s:a action="utilisateur_detail">
            <s:param name="id" value="topo.idUtilisateur" />
            <s:property value="utilisateur.username"/>
        Mail :
            <s:property value="utilisateur.email"/>
        </s:a>
    </li>

</ul>


    <s:a action="comment_new"><s:text name="nav.newComment" /></s:a>
    <%@ include file="../_include/footer.jsp" %>
    </div>
</body>
</html>