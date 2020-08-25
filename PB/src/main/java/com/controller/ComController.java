package com.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.ComService;
import com.vo.UserInfoVo;
import com.vo.MenuInfoVo;

@Controller
public class ComController {
    
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
	
    /* 테스트 용*/
	//@ResponseBody
    //@RequestMapping(value = "oracle/sp.pb", method = RequestMethod.POST)
    //public List<UserInfoVo> GetUserInfo(@RequestBody HashMap<String, Object> params) {
	//    
	//    System.out.println(params);
	//    
	//    ComService comService = sqlSessionTemplate.getMapper(ComService.class);
	//    comService.getUserInfo(params);
	//    
	//    List<UserInfoVo> list = (List<UserInfoVo>)params.get("key");
    //    
    //    return list;
    //}
	
	/* 로그인 사용자 정보 조회 */
	@ResponseBody
    @RequestMapping(value = "getUserInfoForLogin.pb", method = RequestMethod.POST)
    public List<UserInfoVo> GetUserInfo(HttpServletRequest requestSession) {
	    HttpSession session = requestSession.getSession();
	    HashMap<String, Object> params = new HashMap<String, Object>();
	    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    UserDetails userDetails = (UserDetails)principal;
	    
	    String username = userDetails.getUsername();
	    params.put("user_id", username);
        
        ComService comService = sqlSessionTemplate.getMapper(ComService.class);
        comService.getUserInfo(params);
        
        List<UserInfoVo> list = (List<UserInfoVo>)params.get("key");
        
        session.setAttribute("userInfo", list);
        
        return list;
    }
	
	/* 사용자 정보 조회 */
    @ResponseBody
    @RequestMapping(value = "getUserInfo.pb", method = RequestMethod.POST)
    public List<UserInfoVo> GetUserInfo(@RequestBody HashMap<String, Object> params) {
        ComService comService = sqlSessionTemplate.getMapper(ComService.class);
        comService.getUserInfo(params);
        
        List<UserInfoVo> list = (List<UserInfoVo>)params.get("key");
        
        return list;
    }
	
    /* 메뉴 정보 조회 */
	@ResponseBody
    @RequestMapping(value = "getMenuInfo.pb", method = RequestMethod.POST)
    public List<MenuInfoVo> GetMenuInfo(@RequestBody HashMap<String, Object> params) {
        
        ComService comService = sqlSessionTemplate.getMapper(ComService.class);
        comService.getMenuInfo(params);
        
        List<MenuInfoVo> list = (List<MenuInfoVo>)params.get("key");
        
        return list;
    }
	
}
