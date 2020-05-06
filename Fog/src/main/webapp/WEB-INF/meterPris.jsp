<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>
<%@ page import="FunctionLayer.AdminFacade" %>

<head>
    <link rel="stylesheet" href="admin/Style.css">
</head>

<table>
    <tr>
        <th>ID</th>
        <th>Træ type</th>
        <th>Længde (cm)</th>
        <th>Bredde (mm)</th>
        <th>Dybde (mm)</th>
        <th>Meterpris (kr/m)</th>
        <th>Vare nummer</th>
    </tr>

    <c:forEach var="i" items="${AdminFacade.getAllWood()}" varStatus="Count">
        <tr>
            <td>
                    ${i.getId()}
            </td>
            <td>
                    ${i.getTræType()}
            </td>
            <td>
                    ${i.getLægde()}
            </td>
            <td>
                    ${i.getBredde()}
            </td>
            <td>
                    ${i.getHøjde()}
            </td>
            <td style="width: 8%">
                <input class="form-control" type="number" value="${i.getMeterPris()}" id="${i.getId()}" onchange="updateDB(${i.getId()}, document.getElementById(${i.getId()}).value)">
            </td>
            <td>
                    ${i.getProduktnummer()}
            </td>

        </tr>
    </c:forEach>
</table>

<form action="FrontController" method="post" id="valueSender">
    <input type="hidden" id="target" name="taget" value="priceSetter">
    <input type="hidden" id="price" name="price" value="">
    <input type="hidden" id="id" name="id" value="">
</form>

<script>

    function updateDB(id, val) {
        document.getElementById('price').value = val;
        document.getElementById('id').value = id;

        document.getElementById('valueSender').submit();
    }

</script>

<%@include file="../Includes/Footer.inc" %>