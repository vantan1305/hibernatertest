package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class SaleOderEntity extends BaseEntity{
    @ManyToOne
    private UserEntity userEntity;
    @ManyToOne
    private ProductEntity productEntity;

    private String code;
    private BigDecimal total;
    private String customer_Name;
    private String customer_Address;
    private String sale;
    private String customer_Email;
    private String customer_Phone;

    @ManyToMany(mappedBy = "saleOderEntityList")
    private List<SaleOderProductEntity> saleOderProductEntityList;

    public SaleOderEntity() {
    }

}
