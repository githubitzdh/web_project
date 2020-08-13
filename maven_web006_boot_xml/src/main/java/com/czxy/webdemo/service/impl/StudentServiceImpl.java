package com.czxy.webdemo.service.impl;

import com.czxy.webdemo.domain.Student;
import com.czxy.webdemo.mapper.StudentMapper;
import com.czxy.webdemo.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liangtong.
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
