package com.eric.service.impl;

import com.eric.service.HelloService;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHelloWithSpring(String name) {
        return "Hello, "+name;
    }
}
