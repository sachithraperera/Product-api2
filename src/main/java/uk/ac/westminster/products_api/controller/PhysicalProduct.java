package uk.ac.westminster.products_api.controller;

public class PhysicalProduct extends Product {
    private double weight;
    private String dimensions;

    public PhysicalProduct(){
    }//Spring Boot uses Jackson to convert JSON into Java objects (deserialization).

    public PhysicalProduct(Long id, String name, double price,double weight,String dimensions){
        super(id,name,price);
        this.weight=weight;
        this.dimensions=dimensions;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
