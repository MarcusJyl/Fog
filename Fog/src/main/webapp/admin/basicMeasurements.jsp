
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>

<head>
    <link rel="stylesheet" href="admin/Style.css">
</head>

<table>
    <tr>
        <th>Værdi Redigering</th>
        <th>Se Tilgænglige Værdier</th>
        <th>Fjern Værdi</th>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="fheight">Tilføj ny højde:</label><br>
            <input type="text" id="fheight" name="height" value="">
            <input type="hidden" name="taget" value="insertHeight">
            <input type="submit" value="Submit">
        </form></td>
        <td><select required class="form-control number-input" id="height" name="height"
                    onchange="saveToStorage('height', document.getElementById('height').value)">
            <option value="" disabled selected>Se tilgængelige højder</option>
            <c:forEach var="i" items="${DimensionsFacade.getHeight()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xheight">Fjern en højde:</label><br>
            <input type="text" id="xheight" name="height" value="">
            <input type="hidden" name="taget" value="removeHeight">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="flenght">Tilføj ny længde:</label><br>
            <input type="text" id="flenght" name="length" value="">
            <input type="hidden" name="taget" value="insertLength">
            <input type="submit" value="Submit">
        </form></td>
        <td><select required class="form-control number-input" id="length" name="length"
                    onchange="saveToStorage('length', document.getElementById('length').value); draw('draw')">
            <option value="" disabled selected>Se tilgængelige længder</option>
            <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xlength">Fjern en længde:</label><br>
            <input type="text" id="xlength" name="length" value="">
            <input type="hidden" name="taget" value="removeLength">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="fwidth">Tilføj ny bredde:</label><br>
            <input type="text" id="fwidth" name="width" value="">
            <input type="hidden" name="taget" value="insertWidth">
            <input type="submit" value="Submit">
        </form></td>
        <td><select required class="form-control number-input" id="width" name="width"
                    onchange="saveToStorage('width', document.getElementById('width').value); draw('draw')">
            <option value="" disabled selected>Se tilgængelige bredder</option>
            <c:forEach var="i" items="${DimensionsFacade.getWidth()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xwidth">Fjern en bredde:</label><br>
            <input type="text" id="xwidth" name="width" value="">
            <input type="hidden" name="taget" value="removeWidth">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="POST">
            <label for="fslope">Tilføj ny vinkel:</label><br>
            <input type="text" id="fslope" name="slope" value="">
            <input type="hidden" name="taget" value="insertSlope">
            <input type="submit" value="Submit">
        </form></td>
        <td><select required class="form-control number-input" id="slope" name="slope"
                    onchange="saveToStorage('length', document.getElementById('slope').value)">
            <option value="" disabled selected>Se tilgængelige vinkler</option>
            <c:forEach var="i" items="${DimensionsFacade.getSlope()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select></td>
        <td><form action="FrontController" method="POST">
            <label for="xslope">Fjern en vinkel:</label><br>
            <input type="text" id="xslope" name="slope" value="">
            <input type="hidden" name="taget" value="removeSlope">
            <input type="submit" value="Submit">
        </form></td>
</table>

<%@include file="../Includes/Footer.inc" %>