package com.bjcoder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        UserService orderService = applicationContext.getBean(UserService.class);

        List<String> strs = orderService.listName("fdfdfd");


        strs.stream().forEach(System.out::println);

    }

}
