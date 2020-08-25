/**
분류 프로그램명        작성자        작성일
----------------------------------------------
신규 Layout.js           BB        2020.07.01
----------------------------------------------   
 */
'use strict';

let Val = {};
 
let menuParams = {
    'menu_seq' : 0
};
 
let Layout_init = function () {
    $.ajax({
        url: `getUserInfoForLogin.pb`,
        type: 'POST',
        dataType: "json",
        contentType: "application/json",
        success: function(data) {
            Val.userInfo = data[0];
        },
        error: function(errorThrown) {
            alert(errorThrown.statusText);
        }
    });
    
    $.ajax({
        url: `getMenuInfo.pb`,
        type: 'POST',
        data: JSON.stringify(menuParams),
        dataType: "json",
        contentType: "application/json",
        success: function(data) {
            Val.menuInfo = data;
            
            menuRender(Val.menuInfo);
        },
        error: function(errorThrown) {
            alert(errorThrown.statusText);
        }
    });
};

let topMenuClickProcess = function(i_menu_seq) {
    let menu_info = Val.menuInfo
      , menu_seq = i_menu_seq
      , left_menu_list = ''
      ;
    
    $.each(menu_info, function(index, item){
        if (item.upper_menu_seq === menu_seq) {
            if (item.menu_div !== 'dir') {
                let temp_menu = '';
                
                temp_menu = '<ul style="margin-top: 10px; margin-left: -30px;">';
                temp_menu += '<il>';
                temp_menu += '<a href="#" onclick="javascript:leftMenuClickProcess(\'';
                temp_menu += item.menu_url;
                temp_menu += '\')"';
                temp_menu += 'style="font-size: 20px; cursor: pointer;">';
                temp_menu += item.menu_nm;
                temp_menu += '</a>';
                temp_menu += '</il>';
                temp_menu += '</ul>';
                
                left_menu_list += temp_menu;               
            } else {};
        } else {};
    });
    
    $('#leftContents').html(left_menu_list);
};

let leftMenuClickProcess = function(i_menu_url) {
    $.ajax({
        url: i_menu_url,
        method: 'POST',
        dataType: 'html',
        success : function (res) {
            /*// 서번단에서 HTML을 반환해서 기존 페이지를 깜빡임없이 새로 고친다.
            document.querySelector("#appendHtml").innerHTML = res;*/
            //$('#mainContents').innerHTML = res;
            $('#mainContents').html(res)
        },
        error: function (xhr) {
            alert("fail");
        }
    });
};

let menuRender = function(i_data) {
    let menu_info = i_data;
    let top_menu_list = '';

    $.each(menu_info, function(index, item){
        if (item.upper_menu_seq === 0) { // 상단 메뉴
            // innerHTML로 상단 메뉴 작성 후 넣기
            let temp_menu = '';
            
            temp_menu = '<a href="#" onclick="javascript:topMenuClickProcess(';
            temp_menu += item.menu_seq;
            temp_menu += ')"';
            temp_menu += 'style="display: inline-block; margin-right: 100px; font-size: 30px; cursor: pointer;">';
            temp_menu += item.menu_nm;
            temp_menu += '</a>';
            
            top_menu_list += temp_menu;
        } else {}
    });
    
    $('#topMenu').html(top_menu_list);

};

 
$(document).ready(function() {
    Layout_init();
});