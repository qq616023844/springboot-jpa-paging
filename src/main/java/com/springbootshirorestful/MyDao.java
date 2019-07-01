package com.springbootshirorestful;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Map;

public interface MyDao extends JpaRepository<Student, Integer> {

    //TODO 分页查询demo
    //TODO 注意ORDER BY id limit ?1,1  第一个参数是引用(是你传进来的顺序),第二个参数是1(这个1是固定的)
    @Query(value = " SELECT * FROM student sa WHERE sa.id >= (SELECT sb.id FROM student sb ORDER BY sb.id LIMIT ?1,1) LIMIT ?2 ",
            nativeQuery = true)
    List<Student> temp(int pageOffset, int pageSize);

    //TODO 查询部分字段的demo-sql
    @Query(value = " SELECT sa.name FROM student sa ",
        nativeQuery = true)
    List<Map<String,Object>> temp02();

    //TODO 查询部分字段的demo-hql
    @Query(value = " SELECT new Student(s.name) FROM Student s")
    List<Student> temp03();
}
