package login.controller;

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
public class LoginController {
    
    //@Autowired
    //private SqlSessionTemplate sqlSessionTemplate;
    //
    //@RequestMapping(value = "loginProcess.pb", method = RequestMethod.POST)
    //public ModelAndView LoginProcess(HttpServletRequest request) {
    //    ModelAndView mv = new ModelAndView();
    //    String user_id = request.getParameter("userId");
    //    String user_pw = request.getParameter("userPw");
    //    
    //    HashMap<String, Object> params = new HashMap<String, Object>();
    //    
    //    params.put("user_id", user_id);
    //    params.put("user_pw", user_pw);
    //    
    //    // id, pw �����ؼ� �����ͺ��̽����� ��ġ�ϴ� ���� �����ϴ��� Ȯ�� �� ���� �� �޾ƿ�
    //    
    //    //ComService comService = sqlSessionTemplate.getMapper(ComService.class);
    //    //comService.getUserInfo(params);
    //    //
    //    //List<UserInfoVo> list = (List<UserInfoVo>)params.get("key");
    //    
    //    return null;
    //}
    
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    @RequestMapping(value = "login/loginSuccess.pb")
    public String Login(HttpServletRequest requestSession) throws Exception {
        //ModelAndView mv = new ModelAndView();
        //HttpSession session = requestSession.getSession();
        //HashMap<String, Object> params = new HashMap<String, Object>();
        //Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //UserDetails userDetails = (UserDetails)principal;
        //
        //String username = userDetails.getUsername();
        //params.put("user_id", username);
        //
        //ComService comService = sqlSessionTemplate.getMapper(ComService.class);
        //comService.getUserInfo(params);
        //
        //List<UserInfoVo> list = (List<UserInfoVo>)params.get("key");
        //
        //session.setAttribute("userInfo", list);
        
        //mv.setViewName("/Layout");
        //mv.addObject(list);
        
        return "redirect:/";
    }
    
    /* �α��� ȭ�� ȣ�� */
    @RequestMapping(value = "login/loginProcess.pb")
    public String LoginProcess() throws Exception {
        return "/login/Login";
    }

    /* �α��� ���� ȭ�� ȣ�� */
    @RequestMapping(value = "login/accessDenied.pb")
    public String AccessDeniedPage() throws Exception {
        return "/login/AccessDenied";
    }
}
