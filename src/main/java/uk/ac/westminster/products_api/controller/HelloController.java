package uk.ac.westminster.products_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Spring Boot is working!";
    }

    @GetMapping("/Status")
    public String sayStatus(){
        return "Hello Im sachithra what can i do for you";
    }
    @GetMapping("/GG")
    public String gg(){
        return LocalDate.now().toString();
    }

//    @GetMapping("/Products")
//    public Product getProduct(){
//        Product p =new Product();
//
////        p.setId(12L);
////        p.setName("Salmon");
////        p.setPrice(600);
//
//        return p;
//    }


    @GetMapping("/Person")
    public Person getPerson(){
        Person p1 = new Person();

        p1.setEmail("ashdgw@gmail.com");
        p1.setName("sachithra");

        return p1;

    }
}
