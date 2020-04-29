
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>

<head>
    <link rel="stylesheet" href="admin/Style.css">
</head>

<table>
    <tr>
        <th>Gulve og Tage Redigering</th>
        <th>Se Tilgænglige Værdier</th>
        <th>Fjern Værdi</th>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="fbekladning">Tilføj ny beklædning:</label><br>
            <input type="text" id="fbekladning" name="bekladning" value="">
            <input type="hidden" name="taget" value="insertBekladning">
            <input type="submit" value="Submit">
        </form></td>
        <td><select required class="form-control number-input" id="shedWood" name="shedLength"
                    onchange="saveToStorage('shedWood', document.getElementById('shedWood').value)">
            <option value="" disabled selected>Se beklædninger</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllWoodPanels()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xbekladning">Fjern beklædning:</label><br>
            <input type="text" id="xbekladning" name="bekladning" value="">
            <input type="hidden" name="taget" value="removeBekladning">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="ffloor">Tilføj ny gulvtype:</label><br>
            <input type="text" id="ffloor" name="floor" value="">
            <input type="hidden" name="taget" value="insertFloor">
            <input type="submit" value="Submit">
        </form></td>
        <td> <select required class="form-control number-input" id="shedFloor" name="shedFloor"
                     onchange="saveToStorage('shedFloor', document.getElementById('shedFloor').value)">
            <option value="" disabled selected>Gulvtype til skur</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllFlooring()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xfloor">Fjern gulvtype:</label><br>
            <input type="text" id="xfloor" name="floor" value="">
            <input type="hidden" name="taget" value="removeFloor">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="fcolor">Tilføj ny farve til tag:</label><br>
            <input type="text" id="fcolor" name="color" value="">
            <input type="hidden" name="taget" value="insertColor">
            <input type="submit" value="Submit">
        </form></td>
        <td></td>
        <td><form action="FrontController" method="POST">
            <label for="xcolor">Fjern farve:</label><br>
            <input type="text" id="xcolor" name="color" value="">
            <input type="hidden" name="taget" value="removeColor">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="froof">Tilføj ny tagtype:</label><br>
            <input type="text" id="froof" name="roof" value="">
            <input type="hidden" name="taget" value="insertRoof">
            <input type="submit" value="Submit">
        </form></td>
        <td> <select required class="form-control number-input" id="roofType" name="roofType"
                     onchange="saveToStorage('roofType', document.getElementById('roofType').value)">
            <option value="" disabled selected>Vælg tagtype</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllRoof()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="aroof">Fjern gulvtype:</label><br>
            <input type="text" id="aroof" name="roof" value="">
            <input type="hidden" name="taget" value="removeRoof">
            <input type="submit" value="Submit">
        </form></td>
</table>

<%@include file="../Includes/Footer.inc" %>