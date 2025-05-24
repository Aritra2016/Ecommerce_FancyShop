package org.aritra.ecommerce_fancyshop.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;

@Entity // To create a table in Database
@Table (name="products") //Used if table's name is required to change
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer popularity;

    @Column(name="image_url")
    private String imageurl;

    @Column(name="created_at",nullable = false)
    private Instant createdAt;

    @Column(name="created_by",nullable = false)
    private String createdBy;

    @Column(name="updated_at")
    private Instant updatedAt;

    @Column(name="updated_by")
    private String updatedBy;

}
