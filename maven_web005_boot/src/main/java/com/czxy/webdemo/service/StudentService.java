package com.czxy.webdemo.service;

import com.czxy.webdemo.domain.Student;

import java.util.List;

/**
 * Created by liangtong.
 */
public interface StudentService {
    /**
     * 查询所有
     * @return
     */
    public List<Student> findAll();
}
