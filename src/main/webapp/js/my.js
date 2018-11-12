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

// function a1() {
//     for (var i = 0; i < document.getElementsByName("service").length; i++) {
//         var node = document.getElementsByName("service").item(i).children;
//         switch (node.item(0).getAttribute("value")) {
//             case "订单成功" : node.item(2).setAttribute("type","hidden"); break;
//             case "未支付" : node.item(2)   .setAttribute("type","hidden"); break;
//             case "待评价" : node.item(2).setAttribute("type","hidden"); break;
//             case "订单取消" : node.item(2).setAttribute("type","hidden"); break;
//         }
//     }
// }

// case "订单成功": service.namedItem("pay").children.namedItem("payOrderForm").setAttribute("type","hidden");
// service.namedItem("cancel").children.namedItem("cancelOrderForm").setAttribute("type","hidden");break;

function service() {
    var serviceList = document.getElementsByName("service");
    for (var i = 0; i < serviceList.length; i++) {
        var service = serviceList.item(i).children;
        switch (service.namedItem("status").getAttribute("value")){
            case "订单成功": serviceList.item(i).style.display="none"; break;
            case "未支付" : break;
            case "订单取消": serviceList.item(i).style.display="none"; break;
        }

    }

}

function reload() {


}