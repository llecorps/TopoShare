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



    <s:form action="search">

        <s:textfield placeholder="Mots-clés" name="search.mot"  />

        <s:checkboxlist label="Recherche par Champ" name="search.champ" list="champTopo" />

        <s:select label="Recherche par Notation"
                  list="listVoie" listKey="id" listValue="notation"
                  emptyOption="true"
                 name="search.notation" />


        <s:submit value="OK"/>

    </s:form>

    <%@ include file="../_include/footer.jsp" %>
</div>
</body>
</html>