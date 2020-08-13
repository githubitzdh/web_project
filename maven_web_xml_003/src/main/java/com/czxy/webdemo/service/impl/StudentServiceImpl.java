package com.czxy.webdemo.service.impl;

import com.czxy.webdemo.domain.Student;
import com.czxy.webdemo.mapper.StudentMapper;
import com.czxy.webdemo.service.StudentService;

import java.util.List;

/**
 * Created by liangtong.
 */
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.selectAll();
    }
}
