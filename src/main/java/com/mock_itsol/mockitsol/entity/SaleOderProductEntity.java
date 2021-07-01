package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class SaleOderProductEntity extends BaseEntity{
    @ManyToOne
    private ProductEntity productEntity;

    @ManyToMany(mappedBy = "saleOderProductEntityList")
    private List<SaleOderEntity> saleOderEntityList;

    private Integer quantity;

    public SaleOderProductEntity() {
    }

}
