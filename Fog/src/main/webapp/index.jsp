<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>

<div class="row">
    <div class="form-group col-lg-5 mt-5"></div>
    <div class="form-group col-lg-2 mt-5">
        <div class="form-group mt-4">
            Højde
            <select required class="form-control number-input" id="height" name="height"
                    onchange="saveToStorage('height', document.getElementById('height').value)">
                <option value="" disabled selected>Højde</option>
                <c:forEach var="i" items="${DimensionsFacade.getHeight()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="width" name="width"
                    onchange="saveToStorage('width', document.getElementById('width').value); draw('draw')">
                <option value="" disabled selected>Bredde</option>
                <c:forEach var="i" items="${DimensionsFacade.getWidth()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="length" name="length"
                    onchange="saveToStorage('length', document.getElementById('length').value); draw('draw')">
                <option value="" disabled selected>Længde</option>
                <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-4">
            Ønskes der tag med rejsning?
            <label class="container">Ja
                <input type="checkbox" id="myCheckTag" onclick="myFunctionTag()">
                <span class="checkmark"></span>
            </label>
        </div>

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="slope" name="slope"
                    onchange="saveToStorage('length', document.getElementById('slope').value)">
                <option value="" disabled selected>Hældning af tag</option>
                <c:forEach var="i" items="${DimensionsFacade.getSlope()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="roofType" name="roofType"
                    onchange="saveToStorage('roofType', document.getElementById('roofType').value)">
                <option value="" disabled selected>Vælg tagtype</option>
                <c:forEach var="i" items="${DimensionsFacade.getAllRoof()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-4">
            Ønskes der skur til carporten?
            <label class="container">Ja
                <input type="checkbox" id="myCheckSkur" onclick="myFunctionSkur()">
                <span class="checkmark"></span>
            </label>
        </div>

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="shedLength" name="shedLength"
                    onchange="saveToStorage('shedLength', document.getElementById('shedLength').value)">
                <option value="" disabled selected>Længde af skur</option>
                <c:forEach var="i" items="${DimensionsFacade.getLength()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="shedWidth" name="shedWidth"
                    onchange="saveToStorage('shedWidth', document.getElementById('shedWidth').value)">
                <option value="" disabled selected>Bredde af skur</option>

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

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="shedWood" name="shedLength"
                    onchange="saveToStorage('shedWood', document.getElementById('shedWood').value)">
                <option value="" disabled selected>Beklædning på skur</option>
                <c:forEach var="i" items="${DimensionsFacade.getAllWoodPanels()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group mt-4">
            <select required class="form-control number-input" id="shedFloor" name="shedFloor"
                    onchange="saveToStorage('shedFloor', document.getElementById('shedFloor').value)">
                <option value="" disabled selected>Gulvtype til skur</option>
                <c:forEach var="i" items="${DimensionsFacade.getAllFlooring()}" varStatus="Count">
                    <option value="${Count.index+1}">
                            ${i}
                    </option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group col-lg-5 mt-5">
        <div class="form-group mt-5">
            Ønskes der beklædning på siderne af carporten?
            <label class="container">Ja
                <input type="checkbox" id="myCheckBacking" onclick="myFunctionSkur()">
                <span class="checkmark"></span>
            </label>
        </div>

        <div class="form-group mt-5">
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="rightCheck">
                <label class="form-check-label" for="rightCheck">Højre</label>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="leftCheck">
                <label class="form-check-label" for="leftCheck">Venstre</label>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="backCheck">
                <label class="form-check-label" for="backCheck">Bagvæggen</label>
            </div>
        </div>

        <div class="form-group mt-5">
            <select required class="form-control number-input" id="backingWood" name="backingWood"
            <option value="" disabled selected>Beklædning til sider</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllWoodPanels()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
            </select>
        </div>
    </div>

    <%--
                <div class="form-group col-lg-5 mt-5">

                    ${requestScope.svgdrawing}

                </div>


            </div>


            <form action="FrontController" method="post" id="valueSender">
                <input type="hidden" id="target" name="taget" value="widthSetter">
                <input type="hidden" id="senderWidth" name="senderWidth" value="">
                <input type="hidden" id="senderLength" name="senderLength" value="">
            </form>

            <script>load()</script>

            <script>loadInput("slope", 'myCheckTag')</script>
            <script>loadInput("roofType", 'myCheckTag')</script>
            <script>loadInput("shedLength", 'myCheckSkur')</script>
            <script>loadInput("shedWidth", 'myCheckSkur')</script>
            <script>loadInput("shedWood", 'myCheckSkur')</script>
            <script>loadInput("shedFloor", 'myCheckSkur')</script>
    --%>


    <%@include file="Includes/Footer.inc" %>
