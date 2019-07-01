package com.springbootshirorestful;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootShiroRestfulApplication.class)
public class SpringbootShiroRestfulApplicationTests {

    @Autowired
    private MyService myService;

    @Test
    public void contextLoads() {
        String demo1 = myService.getStudent(1,3);
        System.out.println("------------------------demo1输出-----------------------");
        System.out.println(demo1);
        System.out.println("------------------------demo1输出结束-----------------------");
        String demo2 = myService.getStudent02();
        System.out.println("------------------------demo2输出-----------------------");
        System.out.println(demo2);
        System.out.println("------------------------demo2输出结束-----------------------");
    }


}
