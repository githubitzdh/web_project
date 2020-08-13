package com.czxy.webdemo.controller;

import com.czxy.webdemo.domain.Student;
import com.czxy.webdemo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liangtong.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll(){
        //查询所有
        List<Student> list = studentService.findAll();

        return list;
    }
}
