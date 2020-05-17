<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<%@include file="../Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>
<%@ page import="FunctionLayer.AdminFacade" %>


<style>
    .input-append .btn.dropdown-toggle {
        float: none;
    }
</style>

<script>
    function x(bredde, dybde, pris) {
        document.getElementById('bredde-input').value = bredde;
        document.getElementById('dybde-input').value = dybde;
        document.getElementById('pris-input').value = pris;
    }

    function setText(id) {
        document.getElementById('appendedInputButton').value = document.getElementById(id).innerText;
    }


</script>

<table class="table table-borderless">
    <tr>
        <th>navn</th>
        <th>Vare nummer</th>
        <th>Længde (cm)</th>
        <th>Bredde (mm)</th>
        <th>Dybde (mm)</th>
        <th>Meterpris (kr/m)</th>
        <th></th>

    </tr>
    <form action="FrontController" method="post">
        <input type="hidden" name="taget" value="woodAdder">
        <tr>
            <td>
                <div class="input-append btn-group">

                    <a class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" id="dropdownMenuButton"
                       aria-haspopup="true"
                       aria-expanded="false">
                        <span class="caret"></span>
                    </a>

                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <c:forEach var="i" items="${AdminFacade.getAllWoodNames()}" varStatus="Count">

                            <a class="dropdown-item" id="${Count.index}" onclick="setText(${Count.index});x(${AdminFacade.getWoodByName(i).getBredde()}, ${AdminFacade.getWoodByName(i).getHøjde()},${AdminFacade.getWoodByName(i).getMeterPris()})" >${i}</a>
                        </c:forEach>
                    </div>

                    <input class="form-control" id="appendedInputButton" type="text" name="name" style="width: auto">
                </div>

            </td>
            <td>
                <input class="form-control" type="number" value="42" id="varenummer-input" name="itemnumber"
                       onchange="console.log(document.getElementsByName('name'))">
            </td>
            <td>
                <input class="form-control" type="number" value="42" id="længde-input" name="length" step=".1">
            </td>
            <td>
                <input class="form-control" type="number" value="42" id="bredde-input" name="width" step=".1">
            </td>
            <td>
                <input class="form-control" type="number" value="42" id="dybde-input" name="depth" step=".1">
            </td>
            <td>
                <input class="form-control" type="number" value="42" id="pris-input" name="price" step=".1">
            </td>
            <td>
                <input class="btn btn-success" type="submit" value="Indsæt">
            </td>
        </tr>
    </form>
</table>


<table class="table table-striped">
    <tr>
        <th>ID</th>
        <th>Type</th>
        <th>Vare nummer</th>
        <th>Længde (cm)</th>
        <th>Bredde (mm)</th>
        <th>Dybde (mm)</th>
        <th>Meterpris (kr/m)</th>
        <th></th>

    </tr>

    <c:forEach var="i" items="${AdminFacade.getAllWood()}" varStatus="Count">
        <tr>
            <td>
                    ${i.getId()}
            </td>
            <td>
                    ${i.getName()}
            </td>
            <td>
                    ${i.getProduktnummer()}
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
                <input class="form-control" type="number" value="${i.getMeterPris()}" id="${i.getId()}"
                       onchange="updateDB(${i.getId()}, document.getElementById(${i.getId()}).value)">
            </td>
            <td style="width: 5%">
                <form action="FrontController" method="post">
                    <input type="hidden" name="taget" value="deleteWood">
                    <input type="hidden" name="deleteId" value="${i.getId()}">
                    <button type="submit" class="btn btn-danger">Slet</button>
                </form>
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