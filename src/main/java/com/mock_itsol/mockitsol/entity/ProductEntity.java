package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table
@Getter
@Setter

public class ProductEntity extends BaseEntity{

    @ManyToOne
    private CategoryEntity categoryEntity;

    private String title; // tiêu đề
    private BigDecimal price;
    private BigDecimal  price_Sale;
    private String short_Description;//mô tả ngắn
    private String detail_Description;// mô tả dài
    private String avatar;
    private String sale;
    private Boolean is_Host;



    @OneToMany(mappedBy = "productEntity")
    private List<Product_ImageEntity> product_imageEntityList;

    @OneToMany(mappedBy = "productEntity")
    private List<SaleOderEntity> saleOderEntityList;

    public ProductEntity() {
    }
}
