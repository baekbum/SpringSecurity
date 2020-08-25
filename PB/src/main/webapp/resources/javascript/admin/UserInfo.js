/**
분류 프로그램명        작성자        작성일
----------------------------------------------
신규 UserInfo.js       BB            2020.07.28
----------------------------------------------   
 */
 'use strict';
 
let init = function () {
    $("#userInfoGrid").jqxGrid({
      theme: 'energyblue',
      width: '100%',
      autoshowloadelement: false,
      source: dataAdapter,
      columns: [
                {text: '사용자 ID', datafield: 'user_id'     , width: '10%' }
              , {text: '사용자 명', datafield: 'user_nm'     , width: '10%' }
              , {text: '전화번호' , datafield: 'user_tel'    , width: '10%' }
              , {text: '주소'     , datafield: 'user_address', width: '10%' }
              , {text: '잠김여부' , datafield: 'lock_yn'     , width: '10%' }
              , {text: '사용여부' , datafield: 'enable_yn'   , width: '10%' }
              , {text: '권한'     , datafield: 'user_auth'   , width: '10%' }
              , {text: '등록일'   , datafield: 'create_dt'   , width: '10%' }
              , {text: '수정일'   , datafield: 'update_dt'   , width: '10%' }
              , {text: '작업'     , datafield: 'work'        , width: '10%' }
              //, {text: '권한', datafield: 'quantity', width: 80, cellsalign: 'right'}
              //, {text: 'Unit Price', datafield: 'price', width: 90, cellsalign: 'right', cellsformat: 'c2'}
              //, {text: 'Total', datafield: 'total', width: 100, cellsalign: 'right', cellsformat: 'c2'}
               ]
    });
};
 
$(document).ready(function() {
    //init();
});