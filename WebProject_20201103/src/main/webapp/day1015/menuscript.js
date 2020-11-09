$(function () {
    $(".submenu").hide();

    // $(".main").hover(function(){
    //     $(this).find(".submenu").show(200);
    // }, function (){
    //     $(this).find(".submenu").hide(200);
    // });

    $("li.main").hover(function () {
        $(this).children("ul").slideDown("fast");//children 중에서 ul인 것을 고르겠다.
    }, function () {
        $(this).children("ul").slideUp("fast");
    });
});