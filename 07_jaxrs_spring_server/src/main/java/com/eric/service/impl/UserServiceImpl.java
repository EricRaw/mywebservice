package com.eric.service.impl;

import com.eric.entity.Car;
import com.eric.entity.User;
import com.eric.service.IUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user " + user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user " + user);

    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<User>();

        List<Car> carList1 = new ArrayList<Car>();
        Car car1 = new Car(101, "保时捷", 1000000d);
        Car car2 = new Car(102, "林肯", 400000d);
        carList1.add(car1);
        carList1.add(car2);

        User user1 = new User(1, "小明", "广州", carList1);

        User user2 = new User(2, "小丽", "深圳", carList1);
        users.add(user1);
        users.add(user2);

        return users;
    }

    @Override
    public User findUserById(Integer id) {
        if (id == 1) {
            return new User(1, "小明", "广州", null);
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user id is " + id);

    }
}
