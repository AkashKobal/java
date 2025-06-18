package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    // saving image separately(sending json and image seperately)
    // in server side accepting json and image separately
    private String imageName;
    private String imageType;
    @Lob // @Lob annotation is used to store large objects in the database(large binary objects)
    private byte[] imageData;

    // created a constructor that accepts an int parameter,
    // this is used to return a new Product with id -1 if the product is not found
    public Product(int i) {
        this.id = id;
    }

}
