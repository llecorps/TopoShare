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
<h2>New Topo</h2>

    <s:if test="#session.utilisateur">
        <s:form action="topo_new">

         <s:textfield name="topo.libelle" label="Libelle" requiredLabel="true" />
         <s:textfield name="topo.lieu" label="Lieu" requiredLabel="true" />
         <s:textfield name="topo.secteur" label="Secteur" requiredLabel="true" />
         <s:textfield name="topo.statut" label="Statut" requiredLabel="true" />
         <s:textfield name="topo.responsable.id" label="Utilisateur"  value="#session.utilisateur.username"/>

            <s:select name="topo.responsable.id" label="Utilisateur" id="ownerFieldId"
              list="listUtilisateur" listKey="id" listValue="username"
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