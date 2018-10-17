package com.atguigu.test;

import com.atguigu.Controller.PhoneController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    ApplicationContext ac = new ClassPathXmlApplicationContext("Test.xml");
    @Test
    public void run(){
        PhoneController bean = ac.getBean(PhoneController.class);
        bean.buyPhone();
    }
}
