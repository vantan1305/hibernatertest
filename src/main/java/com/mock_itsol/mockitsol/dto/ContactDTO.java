package com.mock_itsol.mockitsol.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDTO extends BaseDTO{
    private String first_Name;
    private String last_Name;
    private String email;
    private String message;

    public ContactDTO() {
    }

}
