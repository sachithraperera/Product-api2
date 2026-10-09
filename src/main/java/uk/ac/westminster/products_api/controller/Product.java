package uk.ac.westminster.products_api.controller;

import uk.ac.westminster.products_api.ProductsApiApplication;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(){

    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

}
