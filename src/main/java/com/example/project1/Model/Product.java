package com.example.project1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Data
@Entity
@NoArgsConstructor 
@AllArgsConstructor 
@Table(name = "products")
public class Product {
    @Id
    private int id;
    private String name;
    private int price;
}
