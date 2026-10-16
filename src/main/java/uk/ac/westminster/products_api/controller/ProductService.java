package uk.ac.westminster.products_api.controller;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    private List<Product> products =new ArrayList<>();
    private Long nextId = 1L;

    public List <Product> getAllProducts(){
        return products;
    }

    public Product addProducts(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;

    }
    public Optional<Product> getProductById(Long id){//Optional maybe or may not
        return products.stream() //list through ysnsws
                .filter(products ->products.getId().equals(id) ) //equals
                .findFirst();// yanakota match wena eka ganawa
    }
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

    //products.add(new Product("Sachithra",12)) add using to add Arraylist

}
