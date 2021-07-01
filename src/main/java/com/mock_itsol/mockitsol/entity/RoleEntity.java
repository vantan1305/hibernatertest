package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.User;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@Setter
@Getter
public class RoleEntity extends BaseEntity{

    @ManyToMany(mappedBy = "roleEntity")
    private List<UserEntity> userEntityList;

    private String name;
    private String description;

    public RoleEntity() {
    }

}
