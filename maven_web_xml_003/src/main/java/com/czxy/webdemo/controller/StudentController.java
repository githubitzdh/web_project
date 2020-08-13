package com.czxy.webdemo.controller;

import com.czxy.webdemo.domain.Student;
import com.czxy.webdemo.service.StudentService;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by liangtong.
 */
public class StudentController implements Controller {

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //1 设置数据
        List<Student> list = studentService.findAll();
        modelAndView.addObject("list",list);

        //2 设置视图
        modelAndView.setViewName("student_list");
        return modelAndView;
    }
}
