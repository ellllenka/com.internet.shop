package com.internet.shop.domain;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
/**
 * Created by MyUser on 05.10.2015.
 */
@Entity
public class Good {


    @Id
    @GeneratedValue
    private long id;
    private int price;
    private String name;
    private int quantity;
    private String description;

    public Good(){

    }

    public Good(String name, int price, int quantity, String description){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
