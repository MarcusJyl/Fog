<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>

<div class="row">

    <div class="col-12 text-center">
        <a href="https://www.johannesfog.dk">
            <img src="images/nav.png">
        </a>
    </div>


</div>

<div class="row">
    <div class="col-2"></div>

    <div class="col-8 text-center bg-light">
        <h1>Velkommen til fogs carport quickbygger</h1>
    </div>
    <div class="col-2"></div>


</div>


<div class="row">
    <div class="col-2"></div>
    <div class="form-group col-md-2 bg-light">
        <div class="form-group mt-4">
            Højde
            <select required class="form-control number-input" id="height" name="height"
                    onchange="saveToStorage('height', document.getElementById('height').value); draw('draw')">
                <c:forEach var="i" items="${DimensionsFacade.getHeight()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-2">
            Bredde
            <select required class="form-control number-input" id="width" name="width"
                    onchange="saveToStorage('width', document.getElementById('width').value); draw('draw')">
                <c:forEach var="i" items="${DimensionsFacade.getWidth()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-2">
            Længde
            <select required class="form-control number-input" id="length" name="length"
                    onchange="saveToStorage('length', document.getElementById('length').value); draw('draw')">
                <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>


        <div class="form-group mt-2">
            Ønskes der beklædning på siderne af carporten?
            <label class="container">Ja
                <input type="checkbox" id="myCheckBacking" onclick="myFunctionCoating()">
                <span class="checkmark"></span>
            </label>
        </div>


        <div class="form-group mt-2">
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="rightCheck" name="rightCheck">
                <label class="form-check-label" for="rightCheck">Højre</label>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="leftCheck" name="leftCheck">
                <label class="form-check-label" for="leftCheck">Venstre</label>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="backCheck" name="backCheck">
                <label class="form-check-label" for="backCheck">Bagvæggen</label>
            </div>
        </div>

        <div class="form-group mt-2">
            Beklædning til sider
            <select required class="form-control number-input" id="backingWood" name="backingWood">
                <c:forEach var="i" items="${DimensionsFacade.getAllWoodPanels()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-2">
            Ønskes der tag med rejsning?
            <label class="container">Ja
                <input type="checkbox" id="myCheckTag" onclick="myFunctionTag()">
                <span class="checkmark"></span>
            </label>
        </div>

        <div class="form-group mt-2">
            Længde
            <select required class="form-control number-input" id="slope" name="slope"
                    onchange="saveToStorage('length', document.getElementById('slope').value)">
                <c:forEach var="i" items="${DimensionsFacade.getSlope()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-2">
            Tagtype
            <select required class="form-control number-input" id="roofType" name="roofType"
                    onchange="saveToStorage('roofType', document.getElementById('roofType').value)">
                <c:forEach var="i" items="${DimensionsFacade.getAllRoof()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-2">
            Ønskes der skur til carporten?
            <label class="container">Ja
                <input type="checkbox" id="myCheckSkur" onclick="myFunctionSkur()">
                <span class="checkmark"></span>
            </label>
        </div>

        <div class="form-group mt-2">
            Længde
            <select required class="form-control number-input" id="shedLength" name="shedLength"
                    onchange="saveToStorage('shedLength', document.getElementById('shedLength').value); draw('draw')">
                <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-2">
            Bredde
            <select required class="form-control number-input" id="shedWidth" name="shedWidth"
                    onchange="saveToStorage('shedWidth', document.getElementById('shedWidth').value); draw('draw')">
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

            </select>
        </div>

        <div class="form-group mt-2">
            Beklædningstype
            <select required class="form-control number-input" id="shedWood" name="shedLength"
                    onchange="saveToStorage('shedWood', document.getElementById('shedWood').value)">
                <c:forEach var="i" items="${DimensionsFacade.getAllWoodPanels()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-2">
            Gulvtype
            <select required class="form-control number-input" id="shedFloor" name="shedFloor"
                    onchange="saveToStorage('shedFloor', document.getElementById('shedFloor').value)">
                <c:forEach var="i" items="${DimensionsFacade.getAllFlooring()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>
    </div>


    <div class="form-group col-6 pt-5  bg-light">
        ${requestScope.svgdrawingSide}
        ${requestScope.svgdrawing}

    </div>

    <div class="col-2"></div>

</div>


<form action="FrontController" method="post" id="valueSender">
    <input type="hidden" id="target" name="taget" value="widthSetter">
    <input type="hidden" id="senderWidth" name="senderWidth" value="">
    <input type="hidden" id="senderLength" name="senderLength" value="">
    <input type="hidden" id="senderHeight" name="senderHeight" value="">
    <input type="hidden" id="senderWidthShed" name="senderWidthShed" value="">
    <input type="hidden" id="senderLengthShed" name="senderLengthShed" value="">
</form>

<script>load()</script>

<script>loadInput("slope", 'myCheckTag')</script>
<script>loadInput("roofType", 'myCheckTag')</script>
<script>loadInput("shedLength", 'myCheckSkur')</script>
<script>loadInput("shedWidth", 'myCheckSkur')</script>
<script>loadInput("shedWood", 'myCheckSkur')</script>
<script>loadInput("shedFloor", 'myCheckSkur')</script>
<script>loadInput("rightCheck", 'myCheckCoating')</script>
<script>loadInput("leftCheck", 'myCheckCoating')</script>
<script>loadInput("backCheck", 'myCheckCoating')</script>
<script>loadInput("backingWood", 'myCheckCoating')</script>


<%@include file="Includes/Footer.inc" %>

