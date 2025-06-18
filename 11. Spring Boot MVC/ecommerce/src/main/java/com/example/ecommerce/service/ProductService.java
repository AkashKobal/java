package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProduceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    // HTTP Status Codes:
    // 200 OK: The request has succeeded.
    // 201 Created: The request has been fulfilled and resulted in a new resource being created.
    // 202 Accepted: The request has been accepted for processing, but the processing has not been completed.
    // 204 No Content: The server successfully processed the request, but is not returning any content.
    // 400 Bad Request: The server cannot or will not process the request due to a client error (e.g., malformed request syntax).
    // 401 Unauthorized: The request requires user authentication.
    // 403 Forbidden: The server understood the request, but refuses to authorize it.
    // 404 Not Found: The server can't find the requested resource.


    @Autowired
    private ProduceRepository produceRepository;

    public List<Product> getAllProducts() {
        return produceRepository.findAll();
    }


    public Product getProductById(Long id) {
        return produceRepository.findById(id)
                .orElse(new Product(-1)); // Return a new Product with id -1 if not found
        // do not return null,it a bad habit, instead return a new Product with id -1
        // create a constructor in Product class that accepts an int parameter
        // -1 is used to indicate that the product was not found

    }

    public Product addOrUpdateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return produceRepository.save(product);
    }

    public void deleteProduct(Long id) {
        produceRepository.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return produceRepository.searchProducts(keyword);
    }
}
