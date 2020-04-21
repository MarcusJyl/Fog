<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="Includes/Header.inc" %>
<%@ page import="FunctionLayer.DimensionsFacade" %>

<script>
    function saveToStorage(name, id) {
        localStorage.setItem(name, id);
        console.log(localStorage.getItem(name))
    }
    
</script>


<h1> HEY </h1>
<div class="row">
    <div class="form-group col-lg-5"></div>
    <div class="form-group col-lg-2">
        <select required class="form-control number-input" id="height" name="height" onchange="saveToStorage('height', document.getElementById('height').value)" onload="myFunction()">
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
        <select required class="form-control number-input" id="sel2" name="bottom">
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
        <select required class="form-control number-input" id="sel3" name="bottom">
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
    <select required class="form-control number-input" id="sel4" style="display: none" name="bottom">
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
        <select required class="form-control number-input" id="sel5" style="display: none" name="bottom">
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
        <select required class="form-control number-input" id="sel6" style="display: none" name="bottom">
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
        <select required class="form-control number-input" id="sel7" style="display: none" name="bottom">
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
        <select required class="form-control number-input" id="sel8" style="display: none" name="bottom">
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
        <select required class="form-control number-input" id="sel9" style="display: none" name="bottom">
            <option value="" disabled selected>Gulvtype til skur</option>
            <c:forEach var="i" items="${DimensionsFacade.getAllFlooring()}" varStatus="Count">
                <option value="${Count.index+1}">
                        ${i}
                </option>
            </c:forEach>
        </select>
    </div>
</div>

<script>
    document.getElementById("height").selectedIndex = localStorage.getItem("height");
    console.log(localStorage.getItem('height'))
</script>


<%@include file="Includes/Footer.inc" %>


