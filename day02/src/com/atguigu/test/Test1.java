package com.atguigu.test;

import com.atguigu.beans.Phone;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    ApplicationContext ac = new ClassPathXmlApplicationContext("Test.xml");
    @Test
    public void run(){
        Phone phone = ac.getBean("phone", Phone.class);

        System.out.println(phone);
    }
}
