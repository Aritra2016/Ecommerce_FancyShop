package org.aritra.ecommerce_fancyshop.Service;

import lombok.RequiredArgsConstructor;
import org.aritra.ecommerce_fancyshop.Entity.Product;
import org.aritra.ecommerce_fancyshop.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // Spring IOC container will create Bean for this class
@RequiredArgsConstructor //for constructor
public class ProductServiceImpl implements IProductService{

    private final ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return List.of();
    }
}
