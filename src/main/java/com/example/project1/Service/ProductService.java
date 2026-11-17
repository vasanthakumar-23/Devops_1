package com.example.project1.Service;

import com.example.project1.Model.Product;
import com.example.project1.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired 
    private  ProductRepository product;


    public List<Product> getProducts() {
        return product.findAll();
    }

    public Product createProduct(Product product) {
        return this.product.save(product);
    }
    public boolean deleteProduct(int id){
        try{
            this.product.deleteById(id);
            return true;
        }catch(Error E){
            System.out.print(E);
            return false;
        }
       
    }
    
    public Product updateProduct(int id,Product newProduct){
        if(product.findById(id)==null) return null;
        Product existingProduct=product.findById(id).orElse(null);
        if(product.findById(id)!=null){
            existingProduct.setName(newProduct.getName());
            existingProduct.setPrice(newProduct.getPrice());
            product.save(existingProduct);
            return existingProduct;
        }
        return null;
    }


}