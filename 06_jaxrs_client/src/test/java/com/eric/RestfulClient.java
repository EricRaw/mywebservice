package com.eric;

import com.eric.entity.Car;
import com.eric.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class RestfulClient {
    @Test
    public void save() {
        WebClient client = WebClient.create("http://localhost:8001/rs/userService/user");
        client.type(MediaType.APPLICATION_JSON);
        List<Car> carList1 = new ArrayList<>();
        Car car1 = new Car(101, "保时捷", 1000000d);
        Car car2 = new Car(102, "林肯", 400000d);
        carList1.add(car1);
        carList1.add(car2);
        client.post(new User(88,"eric1","bj",carList1));
    }
    @Test
    public void update(){
        WebClient client = WebClient.create("http://localhost:8001/rs/userService/user");
        client.type(MediaType.APPLICATION_JSON);
        client.put(new User(88,"eric2","bj",null));
    }
    @Test
    public void findAll(){
        WebClient client = WebClient.create("http://localhost:8001/rs/userService/user");
        client.type(MediaType.APPLICATION_JSON);
        client.get();
    }
    @Test
    public void delete(){
        WebClient client = WebClient.create("http://localhost:8001/rs/userService/user/1");
        client.type(MediaType.APPLICATION_JSON);
        client.delete();
    }
}
