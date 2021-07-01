package com.mock_itsol.mockitsol.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Setter
@Getter
public class ContactEntity extends BaseEntity{
    private String first_Name;
    private String last_Name;
    private String email;
    private String message;

    @ManyToOne
    private UserEntity userEntity;

    public ContactEntity() {
    }

}
