package com.mock_itsol.mockitsol.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product_ImageDTO extends BaseDTO{
    private String title;
    private String path;

    public Product_ImageDTO() {
    }
}
