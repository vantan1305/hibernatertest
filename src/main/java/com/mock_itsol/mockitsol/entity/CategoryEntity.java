package com.mock_itsol.mockitsol.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class CategoryEntity extends BaseEntity{

    private String name;
    private String description;
    private String sale;

    @OneToMany(mappedBy = "categoryEntity")
    private List<ProductEntity> productEntityList;

    public CategoryEntity() {
    }
}
