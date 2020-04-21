function myFunctionTag() {
    var checkboxTag = document.getElementById("myCheckTag");
    localStorage.setItem('myCheckTag', checkboxTag.checked);
    var dropdown4 = document.getElementById("slope");
    var dropdown5 = document.getElementById("roofType");
    if (checkboxTag.checked) {
        dropdown4.style.display = "block";
        dropdown5.style.display = "block";
    } else {
        dropdown4.style.display = "none";
        dropdown5.style.display = "none";
    }
}

function myFunctionSkur() {
    var checkboxSkur = document.getElementById("myCheckSkur");
    localStorage.setItem('myCheckSkur', checkboxSkur.checked);
    var dropdown6 = document.getElementById("shedLength");
    var dropdown7 = document.getElementById("shedWidth");
    var dropdown8 = document.getElementById("shedWood");
    var dropdown9 = document.getElementById("shedFloor");
    if (checkboxSkur.checked) {
        dropdown6.style.display = "block";
        dropdown7.style.display = "block";
        dropdown8.style.display = "block";
        dropdown9.style.display = "block";
    } else {
        dropdown6.style.display = "none";
        dropdown7.style.display = "none";
        dropdown8.style.display = "none";
        dropdown9.style.display = "none";
    }
}

function saveToStorage(name, id) {
    localStorage.setItem(name, id);
    console.log(localStorage.getItem(name))
}

function load() {
    document.getElementById("height").selectedIndex = localStorage.getItem("height");
    document.getElementById("width").selectedIndex = localStorage.getItem("width");
    document.getElementById("length").selectedIndex = localStorage.getItem("length");
    document.getElementById("slope").selectedIndex = localStorage.getItem("slope");
    document.getElementById("roofType").selectedIndex = localStorage.getItem("roofType");
    document.getElementById("shedLength").selectedIndex = localStorage.getItem("shedLength");
    document.getElementById("shedWidth").selectedIndex = localStorage.getItem("shedWidth");
    document.getElementById("shedWood").selectedIndex = localStorage.getItem("shedWood");
    document.getElementById("shedFloor").selectedIndex = localStorage.getItem("shedFloor");
    document.getElementById("myCheckSkur").checked = JSON.parse(localStorage.getItem("myCheckSkur"));
    document.getElementById("myCheckTag").checked = JSON.parse(localStorage.getItem("myCheckTag"));

}

function loadInput(id, checkbox) {
    var dropdowns = [];
    for (var i = 0; i < id.length; i++) {
        dropdowns.push(document.getElementById(id[i]));
    }
    if (document.getElementById("myCheckTag").checked) {
        for (var i = 0; i < dropdowns.length; i++) {
            dropdowns[i].style.display = "block";
        }
    } else {
        for (var i = 0; i < dropdowns.length; i++) {
            dropdowns[i].style.display = "none";
        }
    }
}

