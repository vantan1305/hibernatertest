package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class User_RoleEntity extends BaseEntity{

    private Long user_id;
    private Long role_id;
}
