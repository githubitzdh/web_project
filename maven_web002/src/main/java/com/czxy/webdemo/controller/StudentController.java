package com.czxy.webdemo.controller;

import com.czxy.webdemo.domain.Student;
import com.czxy.webdemo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liangtong.
 */
@Controller("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping
    public String findAll(Model model){
        //查询所有
        List<Student> list = studentService.findAll();
        //存放到作用域
        model.addAttribute("list", list );

        return "student_list";
    }
}
