package borad.controller;

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
public class BoardController {
    
    /* ���� �Խ��� ȭ�� ȣ�� */
    @RequestMapping(value = "freeBoard.pb")
    public String FreeBoard() throws Exception {
        return "/board/FreeBoard";
    }

    /* java �Խ��� ȭ�� ȣ�� */
    @RequestMapping(value = "javaBoard.pb")
    public String JavaBoard() throws Exception {
        return "/board/JavaBoard";
    }
    
    /* javascript �Խ��� ȭ�� ȣ�� */
    @RequestMapping(value = "javascriptBoard.pb")
    public String JavascriptBoard() throws Exception {
        return "/board/JavascriptBoard";
    }
    
    /* jsp �Խ��� ȭ�� ȣ�� */
    @RequestMapping(value = "jspBoard.pb")
    public String JspBoard() throws Exception {
        return "/board/JspBoard";
    }
    
    /* css �Խ��� ȭ�� ȣ�� */
    @RequestMapping(value = "cssBoard.pb")
    public String CssBoard() throws Exception {
        return "/board/CssBoard";
    }
}
