package com.moe.java.effective.chapter02.reflection;

import com.moe.java.effective.cahper01.advantage.advantage03.HelloService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Reflection을 이용하여 인스턴스 생성 과정
        Class<?> aClass = Class.forName("com.moe.java.effective.cahper01.advantage.advantage03.HelloService");
        //1. 생성자를 가져와서
        Constructor<?> constructor = aClass.getConstructor();
        //2. 인스턴스를 생성
        HelloService o = (HelloService)constructor.newInstance();
        System.out.println(HelloService.of("ko"));



    }
}
