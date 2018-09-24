<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<header>
    <s:if test="#session.utilisateur">
        Utilisateur connecté :
        <s:property value="#session.utilisateur.username" />
        <s:property value="#session.utilisateur.email" />

        <s:a action="logout">Déconnexion</s:a>
    </s:if>
    <s:else>
        <s:a action="login">Connexion</s:a>
    </s:else>
</header>


<s:actionerror/>
<s:actionmessage/>