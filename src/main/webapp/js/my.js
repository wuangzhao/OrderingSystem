function a2(e) {
    document.getElementById("li1").style.borderBottom="";
    document.getElementById("li2").style.borderBottom="";
    document.getElementById("li3").style.borderBottom="";
    document.getElementById("all1").style.display="none";
    document.getElementById("all2").style.display="none";
    document.getElementById("all3").style.display="none";
    switch (e.id)
    {
        case "li1": document.getElementById("li1").style.borderBottom="2px solid #ff5500";
            document.getElementById("all1").style.display=""; break;
        case "li2": document.getElementById("li2").style.borderBottom="2px solid #ff5500";
            document.getElementById("all2").style.display=""; break;
        case "li3": document.getElementById("li3").style.borderBottom="2px solid #ff5500";
            document.getElementById("all3").style.display=""; break;
    }
}

function a1() {
    for (var i = 0; i < document.getElementsByTagName("service").length; i++) {
        alert(document.getElementsByTagName("service").toString());
        var node = document.getElementsByTagName("service").item(i).children;
        for (var j = 0; j < node.length; j++) {

            node.item(j).setAttribute("type","hidden");
        }
    }

}