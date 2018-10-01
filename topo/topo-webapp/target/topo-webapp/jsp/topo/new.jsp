<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/head.jsp" %>

    <style type="text/css">

        label[for="nameFieldId"] {
            color: midnightblue;
        }
        label[for="passFieldId"] {
            color: midnightblue;
        }
        label[for="ownerFieldId"] {
            color: midnightblue;
        }
        label[for="secteurFieldId"] {
            color: midnightblue;
        }
        label[for="statutFieldId"] {
            color: midnightblue;
        }

    </style>


</head>

<body>
<s:actionerror/>
<s:actionmessage/>
<%@ include file="../../WEB-INF/menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
<h2>Création d'un topo</h2>

<s:form action="topo_new">

  <s:textfield name="topo.libelle" label="Libelle" requiredLabel="true" id="nameFieldId"/>
  <s:textfield name="topo.lieu" label="Lieu" requiredLabel="true" id="passFieldId"/>
  <s:textfield name="topo.secteur" label="Secteur" requiredLabel="true" id="secteurFieldId"/>
  <s:textfield name="topo.statut" label="Statut" requiredLabel="true" id="statutFieldId"/>
  <s:select name="topo.responsable.id" label="Utilisateur" id="ownerFieldId"
              list="listUtilisateur" listKey="id" listValue="username"
              emptyOption="true"
              requiredLabel="true"/>
    <s:submit value="OK"/>

</s:form>
    </div>
</body>
</html>