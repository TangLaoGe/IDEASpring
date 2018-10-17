package com.atguigu.servlet;

import com.atguigu.dao.PhoneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServletImpl implements PhoneServlet {
    @Autowired
    private PhoneDAO pd;

    @Override
    public void buyPhone() {
        System.out.println("购买手机前的一些操作");
        pd.buyPhone();
    }
}
