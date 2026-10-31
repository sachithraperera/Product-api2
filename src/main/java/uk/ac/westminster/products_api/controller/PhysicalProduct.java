package uk.ac.westminster.products_api.controller;

public class PhysicalProduct extends Product implements Discountable{
    private double weight;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(){
    }//Spring Boot uses Jackson to convert JSON into Java objects (deserialization).

    public PhysicalProduct(Long id, String name, double price,double weight,String dimensions){
        super(id,name,price);
        this.weight=weight;
        this.dimensions=dimensions;
    }
    @Override
    public String getSummary(){
        return "Name " + getName() + "Weight " + weight;
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

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
