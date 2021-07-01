package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class UserEntity extends BaseEntity{

    @ManyToMany(mappedBy = "userEntity")
    private List<RoleEntity> roleEntity;

    private String userName;
    private String email;
    private String password;
    private Boolean is_Admin;


    @OneToMany(mappedBy = "userEntity")
    private List<ContactEntity> contactEntityList;

    @OneToMany(mappedBy = "userEntity")
    private List<SaleOderEntity> saleOderEntityList;

    public UserEntity() {
    }
}
