package com.mock_itsol.mockitsol.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO extends BaseDTO{
    private String userName;
    private String email;
    private String password;
    private Boolean isAdmin;
    private List<RoleDTO> roleDTOList;
    private List<ContactDTO> contactDTOList;
    private List<SaleOderDTO> saleOderDTOList;

    public UserDTO() {
    }
}
