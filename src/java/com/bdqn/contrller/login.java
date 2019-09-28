package com.bdqn.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 忍
 * @title: login
 * @projectName priactices
 * @description: TODO
 * @date 2019/4/211:01
 */
@Controller
public class login {
    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("login");
        String pwd = request.getParameter("pwd");
        String result = "";
        if (name.equals("17606556909") && pwd.equals("123456")){
            result = "登录成功";
        }else {
            result = "登录失败";
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/register.do")
    public ModelAndView register(String username,String pwd){
        ModelAndView mv = new ModelAndView();
        mv.addObject("username",username);
        mv.addObject("pwd",pwd);
        mv.setViewName("register");
        return mv;
    }
}
