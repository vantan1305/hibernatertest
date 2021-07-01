package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Product_ImageEntity extends BaseEntity{
    @ManyToOne
    private ProductEntity productEntity;

    private String title;
    private String path;

    public Product_ImageEntity() {
    }
}
