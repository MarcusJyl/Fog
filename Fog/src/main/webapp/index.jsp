<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>


<form action="FrontController" method="post" id="Annuller">
    <input type="hidden" name="taget" value="Annuller">
</form>

<c:if test="${sessionScope.send.equals('send')}">
    <div class="col-lg-3"></div>
    <div id="Opret" class="jumbotron col-lg-6"
         style="    position: absolute; top: 10%; left: 30%; height: 80%; width: 40%; z-index: 99;">
        <div class="text-center mb-5">
            <h1>Vi kunne ikke finde mailen men du kan oprette dig her</h1>
            <p style="color: red"> ${requestScope.error} </p>
        </div>

        <div class="row" style="text-align: center">
            <input type="text" class="form-control col-6" placeholder="Navn" id="input-name" aria-label="Username"
                   aria-describedby="basic-addon1" name="name">

            <input type="tel" class="form-control col-6" placeholder="telefonenummer" id="input-phone"
                   aria-label="Username" aria-describedby="basic-addon1" name="phone">

            <input type="email" class="form-control mr-sm-2 col-12" placeholder="email" id="input-email"
                   aria-label="Username" aria-describedby="basic-addon1" name="email">
        </div>


        <div style="text-align: center">
            <input class="btn btn-success" onclick="draw('excelMaker')" name="submit" value="Bestil">
        </div>

        <div style="text-align: center; width: auto">
            <input class="btn btn-danger" onclick="document.getElementById('Annuller').submit()" name="submit"
                   value="Annuller">
        </div>
    </div>
    <div class="col-lg-3"></div>
</c:if>

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
    <div class="col-2">
        <div class="form-group bg-light">
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
                    <input type="checkbox" id="myCheckBacking" onclick="hide('myCheckBacking', 'shed')">
                    <span class="checkmark"></span>
                </label>
            </div>

            <div id="shed">
                <div class="form-group mt-2">
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="rightCheck" name="rightCheck"
                               onclick="saveToStorage('rightCheck', document.getElementById('rightCheck').checked)"
                               style="display: block">
                        <label class="form-check-label" for="rightCheck">Højre</label>
                    </div>
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="leftCheck" name="leftCheck"
                               onclick="saveToStorage('leftCheck', document.getElementById('leftCheck').checked)"
                               style="display: block">
                        <label class="form-check-label" for="leftCheck">Venstre</label>
                    </div>
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="backCheck" name="backCheck"
                               onclick="saveToStorage('backCheck', document.getElementById('backCheck').checked)"
                               style="display: block">
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
            </div>
            <div class="form-group mt-2">
                Ønskes der tag med rejsning?
                <label class="container">Ja
                    <input type="checkbox" id="myCheckTag" onclick="hide('myCheckTag','tag' )">
                    <span class="checkmark"></span>
                </label>
            </div>
            <div id="tag">
                <div class="form-group mt-2">
                    Vinkel
                    <select required class="form-control number-input" id="slope" name="slope"
                            onchange="saveToStorage('slope', document.getElementById('slope').value)">
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
            </div>

            <div class="form-group mt-2">
                Ønskes der skur til carporten?
                <label class="container">Ja
                    <input type="checkbox" id="myCheckSkur" onclick="hide('myCheckSkur', 'skur'); draw('draw')">
                    <span class="checkmark"></span>
                </label>
            </div>
            <div id="skur">
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
                    Ønskes der skur af halv eller hel carpot bredde?
                    <label class="container">Halv længde
                        <input type="checkbox" id="checkSkurHalf"
                               onclick="saveToStorage('checkSkurHalf', document.getElementById('checkSkurHalf').checked); draw('draw') ">
                        <span class="checkmark"></span>
                    </label>
                    <label class="container">Hel længde
                        <input type="checkbox" id="checkSkurWhole"
                               onclick="saveToStorage('checkSkurWhole', document.getElementById('checkSkurWhole').checked); draw('draw') ">
                        <span class="checkmark"></span>
                    </label>
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
        </div>
        <input class="btn btn-info btn-block" onclick="document.getElementById('SendOrder').submit()"
               value="Bestil">
    </div>

    <div class="form-group col-6 pt-5  bg-light" style="height: auto">
        ${requestScope.svgdrawing}
    </div>
</div>
</div>


<div class="col-2"></div>
</div>


<form action="FrontController" method="post" id="SendOrder">
    <input type="hidden" name="taget" value="SendOrder">
</form>

<form action="FrontController" method="post" id="valueSender">
    <input type="hidden" id="target" name="taget" value="widthSetter">
    <input type="hidden" id="senderWidth" name="senderWidth" value="">
    <input type="hidden" id="senderLength" name="senderLength" value="">
    <input type="hidden" id="senderHeight" name="senderHeight" value="">
    <input type="hidden" id="senderWidthShed" name="senderWidthShed" value="">
    <input type="hidden" id="senderLengthShed" name="senderLengthShed" value="">
    <input type="hidden" id="senderCheckShed" name="senderCheckShed" value="">
    <input type="hidden" id="senderCheckHalf" name="senderCheckHalf" value="">
    <input type="hidden" id="senderCheckWhole" name="senderCheckWhole" value="">
    <input type="hidden" id="sendSlope" name="sendSlope" value="">
    <input type="hidden" id="sendTag" name="sendTag" value="">
    <input type="hidden" id="name" name="name" value="">
    <input type="hidden" id="email" name="email" value="">
    <input type="hidden" id="phone" name="phone" value="">
</form>

<script>
    load();
</script>


<%@include file="Includes/Footer.inc" %>

