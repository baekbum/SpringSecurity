package admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.service.ComService;
import com.vo.UserInfoVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {
    
    /* ����� ���� ȭ�� ȣ�� */
    @RequestMapping(value = "userInfo.pb")
    public String UserInfo() throws Exception {
        return "/admin/UserInfo";
    }

    /* ���� ���� ȭ�� ȣ�� */
    @RequestMapping(value = "authInfo.pb")
    public String AuthInfo() throws Exception {
        return "/admin/AuthInfo";
    }
    /* �ڵ� ���� ȭ�� ȣ�� */
    @RequestMapping(value = "codeInfo.pb")
    public String CodeInfo() throws Exception {
        return "/admin/CodeInfo";
    }
    /* ÷������ ���� ȭ�� ȣ�� */
    @RequestMapping(value = "fileInfo.pb")
    public String FileInfo() throws Exception {
        return "/admin/FileInfo";
    }
    /* �޴� ���� ȭ�� ȣ�� */
    @RequestMapping(value = "menuInfo.pb")
    public String MenuInfo() throws Exception {
        return "/admin/MenuInfo";
    }
    /* �����ͺ��̽� ���� ȭ�� ȣ�� */
    @RequestMapping(value = "dbInfo.pb")
    public String DbInfo() throws Exception {
        return "/admin/DbInfo";
    }
}
