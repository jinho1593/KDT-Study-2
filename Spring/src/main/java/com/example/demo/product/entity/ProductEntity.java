package com.example.demo.product.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@ToString
@NoArgsConstructor
@Getter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private Integer price;
    private String company;
    private LocalDate manufactureDate;
    private LocalDate expDate;
    private String category;

    public ProductEntity(String name, Integer price, String company, LocalDate manufactureDate, String category) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.manufactureDate = manufactureDate;
        this.expDate = manufactureDate.plusYears(3);
        this.category = category;
    }

}
