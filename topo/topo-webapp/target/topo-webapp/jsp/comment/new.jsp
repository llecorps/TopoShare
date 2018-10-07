<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

    <%@ include file="../_include/head.jsp" %>


<body>
<%@ include file="../menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
<h2>Comment</h2>
<s:if test="#session.utilisateur">
<s:form action="comment_new">
    <s:textarea name="commentaire.description" label="commentaire" requiredLabel="true" size="100" id="nameFieldId"/>
        <s:select name="commentaire.topoguide.id" label="Topo" id="topoFieldId"
              list="listTopo" listKey="id" listValue="libelle"
              emptyOption="true"
              requiredLabel="true"/>


    <s:submit value="OK"/>
</s:form>
</s:if>
    <s:else>
        <s:a action="login">Logon required !</s:a>
    </s:else>

    <%@ include file="../_include/footer.jsp" %>
</div>
</body>
</html>
