package com.czxy.demo01;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.czxy.domain.Student;
import org.junit.Test;

/**
 * Created by liangtong.
 */
public class Test01Read {

    @Test
    public void testRead(){
        String file = getPath() + "demo.xls";
        //EasyExcel.read(文件, 封装对象, 处理类).sheet("表").doRead();
        EasyExcel.read(file, Student.class, new Student01Listener()).sheet("Java78").doRead();
    }

    @Test
    public void testMoreRead(){
        String file = getPath() + "demo.xls";
        //EasyExcel.read(文件, 封装对象, 处理类).sheet("表").doRead();

        ExcelReader excelReader = EasyExcel.read(file, Student.class, new Student02Listener()).build();
        // 确定需要解析的sheet
        ReadSheet readSheet56 = EasyExcel.readSheet("Java56").build();
        excelReader.read(readSheet56);

        ReadSheet readSheet78 = EasyExcel.readSheet("Java78").build();
        excelReader.read(readSheet78);

        excelReader.finish();
    }

    /**
     * 获得根路径
     * @return
     */
    public String getPath() {
        return this.getClass().getResource("/").getPath();
    }
}
