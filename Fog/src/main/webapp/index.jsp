<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>

<h1> HEY </h1>
<div class="row">
    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="height" name="height" onchange="saveToStorage('height', document.getElementById('height').value)">
            <option value="" disabled selected>Højde</option>
                    <c:forEach var="i" items="${DimensionsFacade.getHeight()}" varStatus="Count">
                        <option value="${Count.index+1}">
                                ${i}
                        </option>
                    </c:forEach>
        </select>
    </div>
    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">

            <select required class="form-control number-input" id="width" name="width" onchange="saveToStorage('width', document.getElementById('width').value)">
            <option value="" disabled selected>Bredde</option>
                    <c:forEach var="i" items="${DimensionsFacade.getWidth()}" varStatus="Count">
                        <option value="${Count.index+1}">
                                ${i}
                        </option>
                    </c:forEach>
        </select>
    </div>
    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="length" name="length" onchange="saveToStorage('length', document.getElementById('length').value)">
            <option value="" disabled selected>Længde</option>
                    <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                        <option value="${Count.index+1}">
                                ${i}
                        </option>
                    </c:forEach>
        </select>
    </div>
    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        Ønskes der tag med rejsning?
    <label class="container">Ja
        <input type="checkbox" id="myCheckTag" onclick="myFunctionTag()">
        <span class="checkmark"></span>
    </label>
    </div>

<div class="form-group col-lg-5"></div>

<div class="form-group col-lg-5"></div>
<div class="form-group col-lg-2">
    <select required class="form-control number-input" id="slope" name="slope" onchange="saveToStorage('length', document.getElementById('slope').value)">
        <option value="" disabled selected>Hældning af tag</option>
        <c:forEach var="i" items="${DimensionsFacade.getSlope()}" varStatus="Count">
            <option value="${Count.index+1}">
                    ${i}
            </option>
        </c:forEach>
    </select>
</div>
    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="roofType" name="roofType" onchange="saveToStorage('roofType', document.getElementById('roofType').value)">
            <option value="" disabled selected>Vælg tagtype</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllRoof()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select>
    </div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-2">
        Ønskes der skur til carporten?
    <label class="container">Ja
        <input type="checkbox" id="myCheckSkur" onclick="myFunctionSkur()">
        <span class="checkmark"></span>
    </label>
    </div>

    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="shedLength" name="shedLength" onchange="saveToStorage('shedLength', document.getElementById('shedLength').value)">
            <option value="" disabled selected>Længde af skur</option>
            <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select>
    </div>
    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="shedWidth" name="shedWidth" onchange="saveToStorage('shedWidth', document.getElementById('shedWidth').value)">
            <option value="" disabled selected>Bredde af skur</option>
            <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select>
    </div>
    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="shedWood" name="shedLength" onchange="saveToStorage('shedWood', document.getElementById('shedWood').value)">
            <option value="" disabled selected>Beklædning på skur</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllWoodPanels()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select>
    </div>

    <div class="form-group col-lg-5"></div>

    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="shedFloor" name="shedFloor" onchange="saveToStorage('shedFloor', document.getElementById('shedFloor').value)">
            <option value="" disabled selected>Gulvtype til skur</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllFlooring()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select>
    </div>
</div>

<script>loadInput(["slope","roofType"], 'myCheckTag')</script>
<script>loadInput(["shedLength", "shedWidth", "shedWood", "shedFloor"], 'myCheckSkur')</script>
<script>load()</script>


<%@include file="Includes/Footer.inc" %>


