package uk.ac.westminster.products_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//request mapping - url path defined for controller
@RestController //create rest apis handles http request and send responses
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();

    }
    @GetMapping("/products/{id}") //getmapping read
    public Product getProductById(@PathVariable Long id) {//pathvarible mean URL
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/products")//postmapping create
    public Product addProduct(@RequestBody Product product){//add requestbody deserialization
        return productService.addProducts(product);
    }

    @DeleteMapping("/products/{id}")
    public void deletProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}



//    @GetMapping("/{id}")
//    public Product getById(@PathVariable Long id) {
//        return new Product(id, "Laptop", 999.99);
//    }

