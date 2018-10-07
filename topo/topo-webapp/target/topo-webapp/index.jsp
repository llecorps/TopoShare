<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<body>
<%@ include file="jsp/menu.jsp" %>
<s:actionerror/>
<s:actionmessage />

  <div class="container">
      <%@ include file="jsp/_include/header.jsp" %>




<div class="row">
    <div class="col-md-4">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Topo</h5>
                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                <s:a action="topo_list" class="btn btn-primary"><s:text name="nav.goTopo" /></s:a>
            </div>
        </div>
    </div>

        <div class="col-md-4">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Location</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <s:a action="location_list" class="btn btn-primary"><s:text name="nav.goLocation" /></s:a>
                </div>
            </div>
    </div>



</div>


<%@ include file="jsp/_include/footer.jsp" %>
</body>
</html>