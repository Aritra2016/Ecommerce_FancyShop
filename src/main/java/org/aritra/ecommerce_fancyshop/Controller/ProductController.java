package org.aritra.ecommerce_fancyshop.Controller;

import lombok.RequiredArgsConstructor;
import org.aritra.ecommerce_fancyshop.Entity.Product;
import org.aritra.ecommerce_fancyshop.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor // instead of Using Constructor
public class ProductController {

    private final ProductRepository productRepository;

    //Constructor Injection
    /*@Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

     */

    @GetMapping("/display")
    public String getProductsDisplay(){
        return " Let me know what products you are looking for";
    }

    @GetMapping("/findAll")
    public List<Product> getAllProducts(){
       List<Product> productList= productRepository.findAll();
       return productList;
    }

}
