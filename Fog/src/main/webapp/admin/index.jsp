<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../Includes/Header.inc" %>

<form action="../FrontController" method="post" id="adminSide">
    <input type="hidden" name="taget" value="adminSide">
</form>

<script>
    document.getElementById('adminSide').submit();
</script>




<%@include file="../Includes/Footer.inc" %>
