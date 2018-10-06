<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <title>Topo</title>

    <%@ include file="jsp/_include/head.jsp" %>
</head>

<body>
<%@ include file="WEB-INF/menu.jsp" %>
<s:actionerror/>
<s:actionmessage />

  <div class="container">
      <%@ include file="jsp/_include/header.jsp" %>


    <h2><s:text name="home.welcome" /></h2>

     <div class="row">
        <div class="col-lg-4">
        <s:a action="topo_list"><s:text name="nav.listTopo" /></s:a>
        </div>
        <div class="col-lg-4">
        <s:a action="comment_list"><s:text name="nav.listComment" /></s:a>
        </div>
        <div class="col-lg-4">
        <s:a action="location_list"><s:text name="nav.listLocation" /></s:a>
        </div>
     </div>
  </div>

<div class="row">
    <div class="col-lg-4">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Topo</h5>
                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                <s:a action="topo_list"><s:text name="nav.goTopo" /></s:a>
            </div>
        </div>
    </div>
    <div class="col-lg-4">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Comment</h5>
                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                <s:a action="comment_list"><s:text name="nav.goComment" /></s:a>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Location</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <s:a action="location_list"><s:text name="nav.listLocation" /></s:a>
                </div>
            </div>
    </div>



</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Javascript de Bootstrap -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>

<%@ include file="WEB-INF/footer.jsp" %>
</body>
</html>