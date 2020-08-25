--DROP PROCEDURE GetUserInfo

create or replace PROCEDURE GetUserInfo 
(
    user_id IN VARCHAR2
  , USER_CURSOR OUT SYS_REFCURSOR
)
IS
    v_user_id VARCHAR2(128) := user_id;
BEGIN
	
    OPEN USER_CURSOR FOR

    SELECT t1.user_id AS user_id
         , t1.user_nm AS user_nm
         , t1.user_tel AS user_tel
         , t1.user_address AS user_address
         , t1.lock_yn AS lock_yn
         , t1.enable_yn AS enable_yn
         , t1.user_auth AS user_auth
         , to_char(t1.create_dt,'YYYY-MM-DD') AS create_dt
         , to_char(t1.update_dt,'YYYY-MM-DD') AS update_dt
    FROM t_user_info t1
   WHERE t1.user_id = v_user_id
       ;
       
END GetUserInfo;
