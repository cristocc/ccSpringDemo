package com.demo;

import com.demo.service.CustomResourceLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * Created by crist on 2021/5/14
 *
 * @author cc
 */
public class Test3 {

    public static void main(String[] args)throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //获取User实例
        CustomResourceLoader loader = (CustomResourceLoader)applicationContext.getBean("customResourceLoader");
        //调用方法
        System.out.println();
        loader.showResourceData();
    }
}
