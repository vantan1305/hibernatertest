package com.mock_itsol.mockitsol.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RoleDTO extends BaseDTO{
    private String name;
    private String description;
    private List<UserDTO> userDTOList;

    public RoleDTO() {
    }
}
