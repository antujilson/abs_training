package com.ust.abs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pro_name;
    private String manuf_name;
    private double price;
    private Integer quantity;
    private Boolean available;
    public Product(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getManuf_name() {
        return manuf_name;
    }

    public void setManuf_name(String manuf_name) {
        this.manuf_name = manuf_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Product(Integer id, String pro_name, String manuf_name, double price, Integer quantity, Boolean available) {
        this.id = id;
        this.pro_name = pro_name;
        this.manuf_name = manuf_name;
        this.price = price;
        this.quantity = quantity;
        this.available = available;
    }
}
