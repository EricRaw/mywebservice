package com.eric.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
public class Client {
    public static void main(String[] args) {
        //服务接口访问http://localhost:8080/jaxws/hello

        //创建cxf代理工厂
        JaxWsProxyFactoryBean proxyFactoryBean = new JaxWsProxyFactoryBean();

        //设置远程访问服务端地址
        proxyFactoryBean.setAddress("http://localhost:8080/jaxws/hello");

        //设置接口类型
        proxyFactoryBean.setServiceClass(HelloService.class);

        //对接口生成代理对象
        /**
         * java代理
         * 1.静态代理
         * 2.动态代理2.1jdk接口代理，cglib子类代理
         */

        HelloService helloService = proxyFactoryBean.create(HelloService.class);
        System.out.println(helloService.getClass());
        //远程访问服务端的方法
        String eric = helloService.sayHello("eric2");
        System.out.println(eric);
    }
}
