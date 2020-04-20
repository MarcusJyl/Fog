function myFunctionTag() {
    var checkboxTag = document.getElementById("myCheckTag");
    var dropdown4 = document.getElementById("sel4");
    var dropdown5 = document.getElementById("sel5");
    if(checkboxTag.checked){
        dropdown4.style.display = "block";
        dropdown5.style.display = "block";
    } else {
        dropdown4.style.display = "none";
        dropdown5.style.display = "none";
    }
}

function myFunctionSkur() {
    var checkboxSkur = document.getElementById("myCheckSkur");
    var dropdown6 = document.getElementById("sel6");
    var dropdown7 = document.getElementById("sel7");
    var dropdown8 = document.getElementById("sel8");
    var dropdown9 = document.getElementById("sel9");
        if(checkboxSkur.checked){
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
