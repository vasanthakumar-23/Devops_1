package com.example.project1.Controller;

import com.example.project1.Model.Product;
import com.example.project1.Service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hi";
    }

    @GetMapping("/about")
    public String about() {
        return "I am a winner";
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
    
    @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable int id,@RequestBody Product newProduct){
        return productService.updateProduct(id,newProduct);
    }


    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}