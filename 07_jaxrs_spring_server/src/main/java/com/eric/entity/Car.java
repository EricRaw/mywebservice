package com.eric.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
@XmlRootElement(name="Car")
public class Car {
    private Integer id;
    private String carName;
    private Double price;

    public Car() {
    }

    public Car(Integer id, String carName, Double price) {
        this.id = id;
        this.carName = carName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
