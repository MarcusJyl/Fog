
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>

<head>
    <link rel="stylesheet" href="admin/Style.css">
</head>
<table>
    <tr>
        <th>Skur Værdi Redigering</th>
        <th>Se Tilgænglige Værdier</th>
        <th>Fjern Værdi</th>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="flength">Tilføj ny længde til skur:</label><br>
            <input type="text" id="flength" name="length" value="">
            <input type="hidden" name="taget" value="insertShedLength">
            <input type="submit" value="Submit">
        </form></td>
        <td><select required class="form-control number-input" id="shedLength" name="shedLength"
                    onchange="saveToStorage('shedLength', document.getElementById('shedLength').value)">
            <option value="" disabled selected>Se tilgængelige længder</option>
            <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xlength">Fjern en længde fra skur:</label><br>
            <input type="text" id="xlength" name="length" value="">
            <input type="hidden" name="taget" value="removeShedLength">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="fwidth">Tilføj ny bredde til skur:</label><br>
            <input type="text" id="fwidth" name="width" value="">
            <input type="hidden" name="taget" value="insertShedWidth">
            <input type="submit" value="Submit">
        </form></td>
        <td><select required class="form-control number-input" id="shedWidth" name="shedWidth"
                    onchange="saveToStorage('shedWidth', document.getElementById('shedWidth').value)">
            <option value="" disabled selected>Se tilgængelige bredder</option>

            <c:if test="${sessionScope.maxWidth != null}">
                <c:forEach var="i" items="${DimensionsFacade.getWidth()}" varStatus="Count">
                    <c:if test="${Integer.parseInt(sessionScope.maxWidth) > Integer.parseInt(i)}">
                        <option value="${Count.index+1}">
                                ${i}
                        </option>
                    </c:if>
                </c:forEach>
            </c:if>
            <c:if test="${sessionScope.maxWidth == null}">
                <c:forEach var="i" items="${DimensionsFacade.getWidth()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </c:if>

        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xwidth">Fjern en bredde fra skur:</label><br>
            <input type="text" id="xwidth" name="width" value="">
            <input type="hidden" name="taget" value="removeShedWidth">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
</table>

<%@include file="../Includes/Footer.inc" %>