package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
        //This will return a 200 OK response by default
    }


    // how to chnage status code in response
    // 200 OK is the default status code for a successful GET request

    @GetMapping("/all-with-response-entity")
    public ResponseEntity<List<Product>> getAllProductsResponseEntity() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.ACCEPTED); // statues code is changed to 202
        // This will return a 202 ACCEPTED response
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        if (product.getId() > 0) {
            return new ResponseEntity<>(product, HttpStatus.OK); // 200 OK
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
        }
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product savedProduct = null;
        try {
            savedProduct = productService.addOrUpdateProduct(product, imageFile);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED); // 201 Created

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 500 Internal Server Error
        }
    }

    // display image
    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getProductImage(@PathVariable Long productId) {
        Product product = productService.getProductById(productId);
        if (product.getId() > 0) {
            return new ResponseEntity<>(product.getImageData(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product updatedProduct = null;
        try {
            updatedProduct = productService.addOrUpdateProduct(product, imageFile);
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        if (product != null) {
            productService.deleteProduct(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
        }
    }

    // Search product
    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword) {
        List<Product> products = productService.searchProducts(keyword);
        System.out.println("searching with :" + keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


}
