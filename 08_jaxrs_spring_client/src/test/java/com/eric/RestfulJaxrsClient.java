package com.eric;

import com.eric.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class RestfulJaxrsClient {
    @Test
    public void save(){
        WebClient webClient = WebClient.create("http://localhost:8080/ws/userService/userService/user");
        webClient.type(MediaType.APPLICATION_JSON);
        webClient.post(new User(3,"eric","Beijing",null));
    }
}
