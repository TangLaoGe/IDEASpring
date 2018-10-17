package com.atguigu.factory;

import com.atguigu.beans.Phone;
import org.springframework.beans.factory.FactoryBean;

public class PhoneFactory implements FactoryBean<Phone> {

    String name;
    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Phone getObject() throws Exception {
        return new Phone(name,type);
    }

    @Override
    public Class<?> getObjectType() {
        return Phone.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
