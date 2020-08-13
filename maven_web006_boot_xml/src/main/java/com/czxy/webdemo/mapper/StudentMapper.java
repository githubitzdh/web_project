package com.czxy.webdemo.mapper;

import com.czxy.webdemo.domain.Student;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by liangtong.
 */
@org.apache.ibatis.annotations.Mapper
public interface StudentMapper{
    /**
     * 查询所有
     * @return
     */
    public List<Student> findAll();
}
