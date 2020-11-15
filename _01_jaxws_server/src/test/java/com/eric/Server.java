package com.eric;

import com.eric.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
public class Server {
    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        //设置服务地址
        factory.setAddress("http://localhost:8080/jaxws/hello");
        //设置服务类
        factory.setServiceBean(new HelloServiceImpl());

        //添加日志输出、输出拦截器、观察soap请求、soap响应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();
        System.out.println("success");
    }
}
