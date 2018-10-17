package com.atguigu.Controller;

import com.atguigu.servlet.PhoneServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PhoneControllerImpl implements PhoneController {
    @Autowired
    private PhoneServlet ps;
    @Override
    public void buyPhone() {
        System.out.println("用户验证成功");

        ps.buyPhone();
    }
}
