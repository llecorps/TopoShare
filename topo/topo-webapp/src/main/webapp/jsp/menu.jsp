<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>Menu</title>

    <link href="<c:url value="/jsp/assets/css/bootstrap.css" />" rel="stylesheet">
    <script src="<c:url value="/jsp/assets/js/jquery.js" />"></script>
    <script src="<c:url value="/jsp/assets/js/bootstrap.min.js" />"></script>



</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">TopoShare</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">

                    <s:a action="index" class="nav-link"><s:text name="nav.index" /></s:a> <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <s:a action="utilisateur_list" class="nav-link"><s:text name="nav.listUser" /></s:a> <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <s:a action="topo_list" class="nav-link"><s:text name="nav.listTopo" /></s:a> <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <s:a action="location_list" class="nav-link"><s:text name="nav.listLocation" /></s:a> <span class="sr-only">(current)</span></a>
            </li>

            <li class="nav-item">
                <s:if test="#session.utilisateur">
                    <s:a action="logout" class="nav-link">Logout</s:a>
                </s:if>
                <s:else>
                    <s:a action="login" class="nav-link">Login</s:a>
                </s:else>
                <span class="sr-only">(current)</span></a>
            </li>

            <li class="nav-item">

                <s:a action="utilisateur_new" class="nav-link disabled"><s:text name="nav.login" /></s:a> <span class="sr-only">(current)</span></a>
            </li>


        </ul>

        <s:form action="search" class="form-inline  my-lg-0">

            <!--s:textfield name="search.chaine" aria-label="Search" class="form-control " placeholder="Search" /-->

            <s:submit value="Search" class="btn btn-outline-success"/>
                    </s:form>


    </div>
</nav>

 </body>
</html>