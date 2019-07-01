package com.springbootshirorestful;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class MyService {
    @Resource
    private MyDao myDao;


    public String getStudent(int pageNum,int pageSize) {
        List<Student> studentList = myDao.temp(MyUtil.calculatePageTotal(pageNum,pageSize),pageSize);
        return JSON.toJSONString(studentList);
    }

    public String getStudent02() {
        List<Student> studentList = null;
        try {
            studentList = ObjectMapping.mapToEntity(myDao.temp02(), Student.class);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(studentList);
    }

    public String getStudent03() {
        List<Student> studentList = myDao.temp03();
        return JSON.toJSONString(studentList);
    }



}
