package com.eric;

import com.eric.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {
    //注入对象
    @Resource
    private HelloService helloService;
    @Test
    public void testSrpingCXF(){
        System.out.println(helloService.getClass());
        String eric = helloService.sayHelloWithSpring("hy");
        System.out.println(eric);
    }

}
