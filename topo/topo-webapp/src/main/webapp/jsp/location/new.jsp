<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <%@ include file="../_include/head.jsp" %>
<body>
<s:actionerror/>
<s:actionmessage/>
<%@ include file="../menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
<h2>New Location</h2>
    <s:if test="#session.utilisateur">
        <s:form action="location_new">

            <s:textfield name="location.datedeb" label="date début" requiredLabel="true" id ="datedebFieldId"/>
            <s:textfield name="location.datefin" label="date fin" requiredLabel="true" id="datefinFieldId"/>
            <s:select name="location.topo.id" label="Topo"
              list="listTopo" listKey="id" listValue="libelle"
              emptyOption="true"
              requiredLabel="true" id="topoFieldId"/>
            <s:select name="location.responsable.id" label="Utilisateur"
              list="listUtilisateur" listKey="id" listValue="username"
              emptyOption="true"
              requiredLabel="true" id="ownerFieldId"/>

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