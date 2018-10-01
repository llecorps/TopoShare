<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>Menu</title>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/styles.css" />

    <style type="text/css">
        body{
            position: relative; /* required */
            padding-top: 100px;	/* prevent content to go underneath the fixed navbar */
            background: url('assets/img/fond.jpg') no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            background-size: cover;
            -o-background-size: cover;
        }
    </style>

</head>

<body data-spy="scroll" data-target="#myNavbar" data-offset="70">
    <nav id="myNavbar" class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Toposhare</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="nav navbar-nav">
                    <li class="active"><s:a action="index"><s:text name="nav.index" /></s:a></li>
                    <li> <s:a action="utilisateur_list"><s:text name="nav.listUser" /></s:a> </li>
                    <li>
                        <s:a action="topo_list"><s:text name="nav.listTopo" /></s:a>
                    </li>
                    <li> <s:a action="location_list"><s:text name="nav.listLocation" /></s:a> </li>
                    <li>
                        <s:a action="login"><s:text name="nav.login" /></s:a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

 </body>
</html>