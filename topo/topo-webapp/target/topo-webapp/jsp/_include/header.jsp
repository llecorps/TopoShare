<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<header>
    <s:if test="#session.utilisateur">
        Utilisateur connecté :
        <s:property value="#session.utilisateur.username" />
        <s:property value="#session.utilisateur.email" />


    </s:if>

</header>


<s:actionerror/>
<s:actionmessage/>