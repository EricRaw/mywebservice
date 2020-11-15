package com.eric;

import com.eric.service.IUserService;
import com.eric.service.impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
public class Restfulserver {
    public static void main(String[] args) {
        //1.创建服务工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        //2.设置服务地址
        factory.setAddress("http://localhost:8001/rs");
        //3.实例化服务类
        factory.setServiceBean(new UserServiceImpl());
        //4.添加日志拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        //5.创建服务
        factory.create();
    }
}
