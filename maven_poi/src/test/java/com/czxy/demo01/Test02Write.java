package com.czxy.demo01;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.czxy.domain.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liangtong.
 */
public class Test02Write {
    /**
     * 准备数据
     * @return
     */
    private List<Student> getData(){
        List<Student> list = new ArrayList<Student>();
        for(int i = 0 ; i < 10 ; i ++){
            Student student = new Student();
            student.setId("stu" + i);
            student.setName("wang" + i);
            student.setAge( 18 + i );
            student.setTelephone("1361234" + i);
            student.setEmail("wang" + i + "@czxy.com");
            student.setBrithday(new Date());
            list.add(student);
        }
        return list;
    }

    /**
     * 获得根路径
     * @return
     */
    public String getPath() {
        return this.getClass().getResource("/").getPath();
    }

    @Test
    public void testWrite(){
        String file = getPath() + "demo02.xls";
        //EasyExcel.write(位置,对象).sheet("表名").doWrite(数据);
        EasyExcel.write(file,Student.class).sheet("Java99").doWrite(getData());
    }

    @Test
    public void testMoreSheetWrite(){
        String file = getPath() + "demo03.xls";

        ExcelWriter excelWriter = EasyExcel.write(file).build();

        for (int i = 0; i < 5; i++) {
            WriteSheet writeSheet = EasyExcel.writerSheet(i, "模板" + i).head(Student.class).build();
            // 分页去数据库查询数据 这里可以去数据库查询每一页的数据
            List<Student> data = getData();
            excelWriter.write(data, writeSheet);
        }

        excelWriter.finish();
    }
}
