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
        label[for="notationFieldId"] {
            color: midnightblue;
        }
        label[for="topoFieldId"] {
            color: midnightblue;
        }
        label[for="hauteurFieldId"] {
            color: midnightblue;
        }
        label[for="largeurFieldId"] {
            color: midnightblue;
        }

    </style>


</head>

<body>
<s:actionerror/>
<s:actionmessage/>
<%@ include file="../menu.jsp" %>
<div class="container">
    <%@ include file="../_include/header.jsp" %>
    <h2>Création d'une Voie</h2>

    <s:form action="voie_new">

        <s:textfield name="voie.libelle" label="Libelle" requiredLabel="true" id="nameFieldId"/>
        <s:textfield name="voie.notation" label="Notation" requiredLabel="true" id="notationFieldId"/>
        <s:textfield name="voie.hauteur" label="Hauteur" requiredLabel="true" id="hauteurFieldId"/>
        <s:textfield name="voie.largeur" label="Largeur" requiredLabel="true" id="largeurFieldId"/>
        <s:select name="voie.topoguide.id" label="Topo" id="topoFieldId"
                  list="listTopo" listKey="id" listValue="libelle"
                  emptyOption="true"
                  requiredLabel="true"/>
        <s:submit value="OK"/>

    </s:form>
</div>
</body>
</html>