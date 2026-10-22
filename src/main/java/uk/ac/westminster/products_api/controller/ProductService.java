package uk.ac.westminster.products_api.controller;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    private List<Product> products =new ArrayList<>();
    private Long nextId = 1L;

    public ProductService(){
        products.add(new DigitalProduct(nextId++,
                "VirusGuard",
                4.50,
                "*#hhtps.jdhgdj",
                23.9));
        products.add(new PhysicalProduct(nextId++,
                "MacBookM3",
                1200.45,
                3,
                "16x8"));
    }
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
                .filter(p -> p.getName().contains(name)) //string contains another string kiyala balanwa
                .toList(); //It collects the filtered results into a new List.
    }

    //products.add(new Product("Sachithra",12)) add using to add Arraylist

}
