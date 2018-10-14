<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>

    <%@ include file="../_include/head.jsp"%>



<body>
<s:actionerror/>
<s:actionmessage />
<%@ include file="../menu.jsp" %>
<div class="container ">
    <%@ include file="../_include/header.jsp" %>


<h2><s:text name="nav.detailTopo" /></h2>

<div class="card " style="width: 18rem;">
<div class="card-body">
    <ul>

    <li>ID : <s:property value="topo.id" /></li>
    <li>Libelle : <s:property value="topo.libelle" /></li>
    <li>Lieu : <s:property value="topo.lieu" /></li>
    <li>Secteur : <s:property value="topo.secteur" /></li>
    <li>Statut : <s:property value="topo.statut" /></li>

    </ul>
</div>
</div>

<div class="card " style="width: 18rem;">
<div class="card-body">
    <ul>
    <li>
        Username:
        <s:a action="utilisateur_detail">
            <s:param name="id" value="topo.idUtilisateur" />
            <s:property value="utilisateur.username"/>
            Mail :
            <span class="badge badge-primary badge-pill">
            <s:property value="utilisateur.email"/>
            </span>
        </s:a>
    </li>
    </ul>
</div>
</div>

 <div class="card " style="width: 18rem;">
 <div class="card-body">
    <ul>
        <li>Way: <s:property value="voie.libelle"/> </li>
        <li>Notation: <s:property value="voie.notation"/> </li>
        <li>Height: <s:property value="voie.hauteur"/> </li>
        <li>Width: <s:property value="voie.largeur"/> </li>
    </ul>
 </div>
 </div>

    <s:a action="voie_new"><s:text name="nav.addWay" /></s:a>
    <s:a action="comment_new"><s:text name="nav.newComment" /></s:a>
    <%@ include file="../_include/footer.jsp" %>
    </div>
</body>
</html>