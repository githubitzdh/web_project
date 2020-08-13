package com.czxy.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * Created by liangtong.
 */
@Data
@ContentRowHeight(10)
@HeadRowHeight(20)  //行高
@ColumnWidth(25)    //列宽
public class Student {
    @ExcelProperty("编号")
    private String id;

    @ExcelProperty({"基本信息","姓名"})   //复制表头
    private String name;

    @ExcelProperty({"基本信息","年龄"})
    private Integer age;

    @ExcelProperty("电话")
    private String telephone;

    @ExcelProperty("邮箱")
    private String email;

    @ExcelProperty("生日")
    @DateTimeFormat("yyyy年MM月dd日")
    private Date brithday;
}
