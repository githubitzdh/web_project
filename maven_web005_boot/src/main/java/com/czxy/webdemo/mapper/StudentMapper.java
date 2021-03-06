package com.czxy.webdemo.mapper;

import com.czxy.webdemo.domain.Student;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by liangtong.
 */
public interface StudentMapper extends Mapper<Student> {

    public List<Student> findAll();
}
