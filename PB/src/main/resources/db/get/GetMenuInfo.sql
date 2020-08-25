--DROP PROCEDURE GetMenuInfo

create or replace PROCEDURE GetMenuInfo 
(
    menu_seq IN NUMBER
  , MENU_CURSOR OUT SYS_REFCURSOR
)
IS
    v_menu_seq NUMBER := menu_seq;
BEGIN
	IF v_menu_seq = 0 THEN
        OPEN MENU_CURSOR FOR
        
        SELECT t1.menu_seq AS menu_seq
             , t1.upper_menu_seq AS upper_menu_seq
             , t1.menu_id AS menu_id
             , t1.menu_nm AS menu_nm
             , t1.menu_url AS menu_url
             , t1.menu_auth AS menu_auth
             , t1.menu_div AS menu_div
             , t1.sort_order AS sort_order
        FROM t_menu_info t1
    ORDER BY t1.sort_order ASC
           ;
    
    ELSE
        OPEN MENU_CURSOR FOR
        
        SELECT t1.menu_seq AS menu_seq
             , t1.upper_menu_seq AS upper_menu_seq
             , t1.menu_id AS menu_id
             , t1.menu_nm AS menu_nm
             , t1.menu_url AS menu_url
             , t1.menu_auth AS menu_auth
             , t1.menu_div AS menu_div
             , t1.sort_order AS sort_order
        FROM t_menu_info t1
       WHERE t1.menu_seq = v_menu_seq
    ORDER BY t1.sort_order ASC
           ;
           
    END IF;
       
END GetMenuInfo;
