package uk.ac.westminster.products_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//request mapping - url path defined for controller
@RestController //create rest apis handles http request and send responses //@RestController tells Spring that this class handles web requests and returns response data.
//Handling HTTP Requests
public class ProductController {

    @Autowired
    private ProductService productService; //asks Spring to inject a matching dependency.

    @GetMapping("/products") //maps HTTP GET requests to this method.
    public List<Product> getAllProducts() { //Why List<Product>?
        //Because the endpoint returns multiple Product objects, not just one.
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}") //getmapping read
    public Product getProductById(@PathVariable Long id) {
        //PathVariable tells Spring to bind that URL value to the id parameter.
        return productService.getProductById(id).orElse(null);
    }

    //@PostMapping maps HTTP POST requests to the method.
    //POST is commonly used to create a resource.
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) { //RequestBody-It tells Spring to read the
        // HTTP request body and deserialize the JSON into a Product object.
        return productService.addProducts(product);
    }

    @DeleteMapping("/products/{id}")
    public void deletProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) { //It reads a query parameter from the URL.
        return productService.findByName(name);
    }
}

//    @GetMapping("/{id}")
//    public Product getById(@PathVariable Long id) {
//        return new Product(id, "Laptop", 999.99);
//    }

