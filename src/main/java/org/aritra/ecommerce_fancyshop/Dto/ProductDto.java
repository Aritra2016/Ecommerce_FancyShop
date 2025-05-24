package org.aritra.ecommerce_fancyshop.Dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class ProductDto {

    //Below data we want to transfer over different layer of application
    private Long productId;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer popularity;
    private String imageurl;
    private String createdBy;


}
