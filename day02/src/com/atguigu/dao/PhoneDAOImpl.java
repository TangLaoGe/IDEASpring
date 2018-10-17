package com.atguigu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PhoneDAOImpl implements PhoneDAO {

    @Override
    public void buyPhone() {
        System.out.println("成功购买手机");
    }
}
