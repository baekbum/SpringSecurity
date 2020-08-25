/**
분류 프로그램명        작성자        작성일
----------------------------------------------
신규 home.js             BB        2020.07.06
----------------------------------------------   
 */
 'use strict';
 
let params = {
    'user_id' : $('#param').val()
};

let init = function () {
    //$('#oracleTest').click( function(){
    //     $.ajax({
    //        url: `oracle/sp.pb`,
    //        type: 'POST',
    //        data: JSON.stringify(params),
    //        dataType: "json",
    //        contentType: "application/json",
    //        success: function(data) {
    //            alert("성공");
    //        },
    //        error: function(errorThrown) {
    //            alert(errorThrown.statusText);
    //        }
    //    });
    //});
    
    //$.ajax({
    //    url: `login`,
    //    type: 'POST',
    //    dataType: "json",
    //    contentType: "application/json",
    //    success: function(data) {},
    //    error: function(e) {}
    //});  
};
 
//let render = function () {
//    $.ajax({
//        url: `/login`,
//        method: 'POST',
//        dataType: 'html',
//        success : function (res) {
//            /*// 서번단에서 HTML을 반환해서 기존 페이지를 깜빡임없이 새로 고친다.
//            document.querySelector("#appendHtml").innerHTML = res;*/
//        },
//        error: function (xhr) {
//            alert("fail");
//        }
//    });
//};
 
$(document).ready(function() {
    //render();
    //init();
});