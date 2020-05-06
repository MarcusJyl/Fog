<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../Includes/Header.inc" %>

<head>
    <link rel="stylesheet" href="admin/Style.css">
</head>

<h1> Velkommen til Fogs administrationsside</h1>

<table>

    <th>Beholdningsredigering</th>

    <tr>
        <td><form action="FrontController" method="post">
            <label>Rediger Gulve og tage</label><br>
            <input type="hidden" name="taget" value="returnRoofsAndFloors">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="post">
            <label>Rediger basale længder:</label><br>
            <input type="hidden" name="taget" value="returnBasicMeasurements">
            <input type="submit" value="Submit">
        </form></td>>
    </tr>
    <tr>
        <td><form action="FrontController" method="post">
            <label>Rediger skurværdier:</label><br>
            <input type="hidden" name="taget" value="returnShed">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
        <td><form action="FrontController" method="post">
            <label>Rediger meter priser:</label><br>
            <input type="hidden" name="taget" value="returnMeterPris">
            <input type="submit" value="Submit">
        </form></td>
    </tr>
    <tr>
</table>


<%@include file="../Includes/Footer.inc" %>
