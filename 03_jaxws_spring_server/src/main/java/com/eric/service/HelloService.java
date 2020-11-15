package com.eric.service;

import javax.jws.WebService;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
@WebService
public interface HelloService {

    String sayHelloWithSpring(String name);
}
