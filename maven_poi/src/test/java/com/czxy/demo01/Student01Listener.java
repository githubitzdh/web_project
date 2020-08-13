package com.czxy.demo01;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.czxy.domain.Student;

/**
 * Created by liangtong.
 */
public class Student01Listener extends AnalysisEventListener<Student> {
    public void invoke(Student student, AnalysisContext analysisContext) {
        System.out.println(student);
    }

    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("所有数据解析完成了 都会来调用");
    }
}
