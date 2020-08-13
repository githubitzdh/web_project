package com.czxy.demo01;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.czxy.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liangtong.
 */
public class Student02Listener extends AnalysisEventListener<Student> {

    // 批量操作数
    private static final int BATCH_COUNT = 10;
    // 用于缓存信息
    private List<Student> cache = new ArrayList<Student>();

    public void invoke(Student student, AnalysisContext analysisContext) {
        //保存学生信息
        cache.add(student);
        if(cache.size() >= BATCH_COUNT){
            // 保存数据
            saveData();
        }
    }

    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        //最后的不够 BATCH_COUNT 倍数
        saveData();
    }

    private void saveData() {
        // 处理缓存数据
        System.out.println(cache);
        // 清空缓存
        cache.clear();
    }
}
