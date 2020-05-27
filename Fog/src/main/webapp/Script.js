function hide(id, div) {
    var checkboxCoating = document.getElementById(id);
    localStorage.setItem(id, checkboxCoating.checked);
    var divElement = document.getElementById(div);

    if (checkboxCoating.checked) {
        divElement.style.display = "block";
    } else {
        divElement.style.display = "none";
    }
}

function saveToStorage(name, val) {
    localStorage.setItem(name, val);
}

function load() {
    document.getElementById("height").selectedIndex = localStorage.getItem("height");
    document.getElementById("width").selectedIndex = localStorage.getItem("width");
    document.getElementById("length").selectedIndex = localStorage.getItem("length");
    document.getElementById("slope").selectedIndex = localStorage.getItem("slope");
    document.getElementById("roofType").selectedIndex = localStorage.getItem("roofType");
    document.getElementById("shedLength").selectedIndex = localStorage.getItem("shedLength");
    document.getElementById("shedWood").selectedIndex = localStorage.getItem("shedWood");
    document.getElementById("shedFloor").selectedIndex = localStorage.getItem("shedFloor");
    document.getElementById("leftCheck").selectedIndex = localStorage.getItem("leftCheck");
    document.getElementById("rightCheck").selectedIndex = localStorage.getItem("rightCheck");
    document.getElementById("backCheck").selectedIndex = localStorage.getItem("backCheck");
    document.getElementById("backingWood").selectedIndex = localStorage.getItem("backingCheck");
    document.getElementById("myCheckSkur").checked = JSON.parse(localStorage.getItem("myCheckSkur"));
    document.getElementById("checkSkurHalf").checked = JSON.parse(localStorage.getItem("checkSkurHalf"));
    document.getElementById("checkSkurWhole").checked = JSON.parse(localStorage.getItem("checkSkurWhole"));
    document.getElementById("myCheckTag").checked = JSON.parse(localStorage.getItem("myCheckTag"));
    document.getElementById("myCheckBacking").checked = JSON.parse(localStorage.getItem("myCheckBacking"));

    hide('myCheckBacking', 'shed');
    hide('myCheckTag', 'tag');
    hide('myCheckSkur', 'skur');
}

function draw(servlet) {
    var widthElement = document.getElementById("width");
    var width = widthElement.options[widthElement.selectedIndex].text;
    document.getElementById('senderWidth').value = width;

    var lengthElement = document.getElementById("length");
    var length = lengthElement.options[lengthElement.selectedIndex].text;
    document.getElementById('senderLength').value = length;

    var heightElement = document.getElementById("height");
    var height = heightElement.options[heightElement.selectedIndex].text;
    document.getElementById('senderHeight').value = height;

    var lengthElementShed = document.getElementById("shedLength");
    var shedLength = lengthElementShed.options[lengthElementShed.selectedIndex].text;
    document.getElementById('senderLengthShed').value = shedLength;

    var checkElementShed = document.getElementById("myCheckSkur").checked;
    document.getElementById('senderCheckShed').value = checkElementShed;

    var checkElementShedHalf = document.getElementById("checkSkurHalf").checked;
    document.getElementById('senderCheckHalf').value = checkElementShedHalf;

    var checkElementShedWhole = document.getElementById("checkSkurWhole").checked;
    document.getElementById('senderCheckWhole').value = checkElementShedWhole;

    var slopeElement = document.getElementById("slope");
    var slope = slopeElement.options[slopeElement.selectedIndex].text;
    document.getElementById('sendSlope').value = slope;

    document.getElementById('sendTag').value = document.getElementById('myCheckTag').checked;

    if(servlet == "excelMaker"){
        document.getElementById('name').value = document.getElementById('input-name').value;
        document.getElementById('email').value = document.getElementById('input-phone').value;
        document.getElementById('phone').value = document.getElementById('input-email').value;
    }

    document.getElementById("target").value = servlet;
    console.log(document.getElementById("target").value);
    document.getElementById('valueSender').submit();
}


