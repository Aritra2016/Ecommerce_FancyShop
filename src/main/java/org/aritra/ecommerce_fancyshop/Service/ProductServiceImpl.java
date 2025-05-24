package org.aritra.ecommerce_fancyshop.Service;

import org.aritra.ecommerce_fancyshop.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // Spring IOC container will create Bean for this class
public class ProductServiceImpl implements IProductService{


    @Override
    public List<Product> getProducts() {

        return List.of();
    }
}
