package com.bdqn.contrller;

import com.bdqn.contrller.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 忍
 * @title: StudentC
 * @projectName priactices
 * @description: TODO
 * @date 2019/4/220:29
 */
@Controller
@RequestMapping("student")
public class StudentC {
    @RequestMapping("/add.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("age",student.getAge());
        mv.setViewName("studentInfo");
        return mv;
    }


        @RequestMapping("/add1.do")
        public ModelAndView addStudent1(Student student){
            ModelAndView mv = new ModelAndView();
            mv.addObject("name",student.getName());
            mv.addObject("age",student.getAge());
            mv.addObject("schoolName",student.getSchool().getName());
            mv.addObject("address",student.getSchool().getAddress());
            mv.setViewName("studentInfo");
            return mv;
        }
}
